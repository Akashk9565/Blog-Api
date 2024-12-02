package com.blogapp.service;

import java.util.List;

import com.blogapp.payloads.CategoryDto;

public interface CategoryService {

	// create 
	public CategoryDto createCategory(CategoryDto categoryDto);
	
	// update 
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	// delete
	void deletecategory(Integer categoryId);
	
	// getById
	public CategoryDto getByCatId(Integer categoryId);
	
	// getAll
	public List<CategoryDto> getAllCategories();
	
}
