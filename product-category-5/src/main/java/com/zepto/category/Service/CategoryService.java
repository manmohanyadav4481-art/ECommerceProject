package com.zepto.category.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.category.Request.response.CategoryRequest;
import com.zepto.category.Request.response.CategoryResponse;
import com.zepto.category.entity.CategoryEntity;
import com.zepto.category.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	
	public CategoryResponse createCategory (CategoryRequest categoryRequest) 
	{
		CategoryEntity categoryEntity = new CategoryEntity();
		
		categoryEntity.setName(categoryRequest.getName());
		categoryEntity.setDescription(categoryRequest.getDescription());
        categoryEntity.setImageUrl(categoryRequest.getImageUrl());
        categoryEntity.setActive("Active");
		CategoryEntity responseEntity =  categoryRepository.save(categoryEntity);
		
		
		CategoryResponse categoryResponse = new CategoryResponse();
		
		categoryResponse.setId(responseEntity.getId());
		categoryResponse.setName(categoryEntity.getName());
		categoryResponse.setDescription(responseEntity.getDescription());
		categoryResponse.setImageUrl(responseEntity.getImageUrl());
		categoryEntity.setActive(responseEntity.getActive());
		
		return categoryResponse;
	}
}
