package com.zepto.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.category.entity.CategoryEntity;
import com.zepto.category.repository.CategoryRepository;
import com.zepto.product.entity.ProductEntity;
import com.zepto.product.repository.ProductRepository;
import com.zepto.product.request.response.ProductRequest;
import com.zepto.product.request.response.ProductResponse;

@Service
public class ProductService {

	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	public ProductResponse createProduct(ProductRequest productRequest)
	{
		
		String categorId = productRequest.getCategoryId();
		
	  CategoryEntity parentEntity = categoryRepository.findById(Long.valueOf(categorId)).get();
	  
	  ProductEntity childEntity = new ProductEntity();
	  
	  childEntity.setCategory(parentEntity);
	  childEntity.setName(productRequest.getName());
	  childEntity.setDescription(productRequest.getDescription());
	  childEntity.setPrice(productRequest.getPrice());
	  childEntity.setQuantity(productRequest.getQuantity());
	  childEntity.setStatus("Active");
	  
	    ProductEntity responseEntity =  productRepository.save(childEntity);
	    
	    ProductResponse productResponse = new ProductResponse();
	    
	    productResponse.setCategoryName(responseEntity.getCategory().getName());
	    productResponse.setDescription(responseEntity.getDescription());
	    productResponse.setPrice(responseEntity.getPrice());
	    productResponse.setQuantity(responseEntity.getQuantity());
	    productResponse.setStatus(responseEntity.getStatus());
	    
	    return productResponse;
	    
	}
}
