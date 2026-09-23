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
	
	public ProductResponse creatProduct(ProductRequest productRequest)
	{
		String categoryId = productRequest.getCategoryId();
		
		CategoryEntity parentEntity = categoryRepository.findById(Integer.valueOf(categoryId)).get();
	
		ProductEntity childEntity = new ProductEntity();
		
		childEntity.setCategory(parentEntity);
		
		childEntity.setName(productRequest.getName());
		childEntity.setDescription(productRequest.getDescription());
		childEntity.setImageUrl(productRequest.getImageUrl());
		childEntity.setActive(productRequest.getActive());
		
		ProductEntity responseEntity = productRepository.save(childEntity);
		
		ProductResponse productResponse = new ProductResponse();
		
	    productResponse.setCategoryId(responseEntity.getCategory().getName());
	    productResponse.setActive(responseEntity.getActive());
	    productResponse.setDescription(responseEntity.getDescription());
	    productResponse.setImageUrl(responseEntity.getImageUrl());
	    productResponse.setName(responseEntity.getName());
	    
	    return productResponse;
	    
	}
}
