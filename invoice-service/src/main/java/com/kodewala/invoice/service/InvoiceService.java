package com.kodewala.invoice.service;


import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.kodewala.invoice.entity.InvoiceEntity;
import com.kodewala.invoice.repository.InvoiceRepository;
import com.kodewala.invoice.request.response.InvoiceRequest;
import com.kodewala.invoice.request.response.InvoiceResponse;

@Service
public class InvoiceService {

	@Autowired
	InvoiceRepository invoiceRepository;
	
	public InvoiceResponse createInvoice(InvoiceRequest invoiceRequest) {
		
		InvoiceEntity entity = new InvoiceEntity();
		
		entity.setCutomerName(invoiceRequest.getCutomerName());
		entity.setGst(invoiceRequest.getGst());
		entity.setStatus("PAID");
		entity.setInvId("INV1234");
		
		
	entity =	invoiceRepository.save(entity);
	
	InvoiceResponse invoiceResponse = new InvoiceResponse();
	
	if(entity.getId()>0)
	{
		invoiceResponse.setCutomerName(entity.getCutomerName());
		invoiceResponse.setGst(entity.getGst());
		invoiceResponse.setStatus(entity.getStatus());
		invoiceResponse.setInvId(entity.getInvId());
		invoiceResponse.setId(entity.getId());
	}
	
	  return invoiceResponse;
	}
	
	@Cacheable(value = "mydatabase", key = "#page + '-' + #size")
	public List<InvoiceResponse> getInvoice(int page, int size) {

	    System.out.println("Fetching invoices from DATABASE......");

	    Pageable pageable = PageRequest.of(page, size);

	    Page<InvoiceEntity> result = invoiceRepository.findAll(pageable);

	    List<InvoiceResponse> responses = new ArrayList<>();

	    for (InvoiceEntity invoiceEntity : result.getContent()) {

	        InvoiceResponse invoiceResponse = new InvoiceResponse();

	        invoiceResponse.setId(invoiceEntity.getId());
	        invoiceResponse.setInvId(invoiceEntity.getInvId());
	        invoiceResponse.setCutomerName(invoiceEntity.getCutomerName());
	        invoiceResponse.setGst(invoiceEntity.getGst());
	        invoiceResponse.setStatus(invoiceEntity.getStatus());

	        responses.add(invoiceResponse);
	    }

	    return responses;
	}
}