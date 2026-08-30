package com.zepto.order.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.order.entity.OrderEntity;
import com.zepto.order.exception.OrderDoesNotExistsException;

import com.zepto.order.response.OrderResponse;
import com.zepto.order.respository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public OrderResponse getOrderById(int id) {

        System.out.println("OrderService.getOrderById() START");
  
        /* System.out.println("Searching orderId = " + id);

       // OrderEntity entity = orderRepository.findById(id).orElse(null);

        if (entity == null) {
            System.out.println("Order not found: " + id);
            return null;
        }
*/
        
        OrderEntity entity=null;
        
        OrderResponse response = new OrderResponse();
        
        try {
        	entity = orderRepository.findOdersByOrderId(id);
        	
            response.setId(entity.getId());
            response.setOrderId(entity.getOrderId());
            response.setCustomerId(entity.getCustomerId());
            response.setProductId(entity.getProductId());
            response.setQuantity(entity.getQuantity());

        } catch (Exception e) {
			
        	throw new OrderDoesNotExistsException("Order Id "+id  +" does not existes");
		}
        
        System.out.println("Order found successfully");

        return response;
    }
    
    public List<OrderResponse> listOrderByPayment(String paymentType)
    {
    	System.out.println("OrderService.listOrderByPayment() ::::::::::::::::::: START ");
    	List<OrderEntity> orderEntities = orderRepository.findOrderByPaymentType(paymentType);
    	
    	List<OrderResponse>response =new ArrayList<OrderResponse>();
    	
    	for (OrderEntity entity : orderEntities) {
    		
    		OrderResponse orderResponse = new OrderResponse();
    		
    		orderResponse.setId(entity.getId());
    		orderResponse.setOrderId(entity.getOrderId());
    		orderResponse.setCustomerId(entity.getCustomerId());
    		orderResponse.setProductId(entity.getProductId());
    		orderResponse.setQuantity(entity.getQuantity());
    		response.add(orderResponse);
		}
    	
    System.out.println("OrderService.listOrderByPayment()  :::::::::::::::: END ");
    	return response;
    }
    
}