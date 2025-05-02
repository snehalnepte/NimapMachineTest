package com.programming.restapi.Service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.programming.restapi.Entity.Category;

public interface CategoryService {
			
		Category addCategory(Category category);
		
		List<Category> getAllCategories();
		
	    Category getCategoryById(Long id);
	    
	    String updateCategory(Long id, Category category);
	    
	    String deleteCategoryById(Long id);
	    	    
	    Page<Category> getAllCategoriesPaginated(int page, int size);

    
}	    
