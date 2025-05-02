package com.programming.restapi.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.programming.restapi.Entity.Category;
import com.programming.restapi.Repository.CategoryRepository;
import com.programming.restapi.Service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
		@Autowired
	    private CategoryRepository categoryRepository;
		
		 @Override
		    public Category addCategory(Category category) {
		        return categoryRepository.save(category);
		    }

		    @Override
		    public List<Category> getAllCategories() {
		        return categoryRepository.findAll();
		    }

		    @Override
		    public Category getCategoryById(Long id) {
		        Optional<Category> categoryOpt = categoryRepository.findById(id);
		        if (categoryOpt.isPresent()) {
		            return categoryOpt.get();
		        } else {
		            return null;
		        }
		    }

		    @Override
		    public String updateCategory(Long id, Category category) {
		        Optional<Category> optionalCategory = categoryRepository.findById(id);
		        if (optionalCategory.isPresent()) {
		            Category c = optionalCategory.get();
		            c.setCategory_name(category.getCategory_name());
		            categoryRepository.save(c);
		            return "Category updated successfully with given id: " + id;
		        } else {
		            return "Category not found with given id: " + id;
		        }
		    }

		    @Override
		    public String deleteCategoryById(Long id) {
		        if (categoryRepository.existsById(id)) {
		            categoryRepository.deleteById(id);
		            return "Category deleted successfully with given id: " + id;
		        } else {
		            return "Category not found with given id: " + id;
		        }
		    }
		   
		 
		    @Override
		    public Page<Category> getAllCategoriesPaginated(int page, int size) {
		        Pageable pageable = PageRequest.of(page, size);
		        return categoryRepository.findAll(pageable);
		    }

}
