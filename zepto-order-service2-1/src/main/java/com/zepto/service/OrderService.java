package com.zepto.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.entity.OrderEntity;
import com.zepto.entity.PaymentEntity;
import com.zepto.order.request.OrderRequest;
import com.zepto.order.response.OrderResponse;
import com.zepto.payment.repository.PaymentRepository;
import com.zepto.repository.OrderRepository;

import jakarta.transaction.Transactional;

@Service
public class OrderService {

   
 
    @Transactional
    public com.zepto.order.response.OrderResponse acceptOrder(OrderRequest orderRequest) {

        System.out.println("OrderService.acceptOrder()::::::::::: START");

        OrderEntity entity = new OrderEntity();

        entity.setCustomerId(orderRequest.getCustomerId());
        entity.setPaymentMethod(orderRequest.getPaymentMethod());
        entity.setProductId(orderRequest.getProductId());
        entity.setQuantity(orderRequest.getQuantity());
        entity.setShippingAddress(orderRequest.getShippingAddress());

        // Business logic
        entity.setOrderId(generateOrderID());

        
        // Creating the order   -  Instruction # 1
        OrderEntity responseEntity = orderRepository.save(entity);

        
        
        //creating exception scenario
        
        
        OrderResponse orderResponse = new OrderResponse();
       
        orderResponse.setOrderId(responseEntity.getOrderId());
        orderResponse.setCustomerId(responseEntity.getCustomerId());
        orderResponse.setTotalAmount(amount);
        orderResponse.setPaymentStatus("success");
        orderResponse.setOrderStatus("Placed");
     
       }
       
       else
       {
    	   
    	   orderResponse.setOrderId(responseEntity.getOrderId());
           orderResponse.setCustomerId(responseEntity.getCustomerId());
           orderResponse.setTotalAmount(amount);
           orderResponse.setPaymentStatus("FAILED");
           orderResponse.setOrderStatus("ON HOLD");
        
    	   
       }
        
        System.out.println("OrderService.acceptOrder() ::::::::: END");
        
        
        return orderResponse;
    }

    private int generateOrderID() {

        Random random = new Random();

        int id = 10000 + random.nextInt(90000);

        return id;
    }

}