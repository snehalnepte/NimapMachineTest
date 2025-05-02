package com.programming.restapi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.programming.restapi.Entity.Product;
import com.programming.restapi.Service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
		@Autowired
	    private ProductService productService;

		@PostMapping("/save")
		public ResponseEntity<String> addProduct(@RequestBody Product product) {
		    productService.addProduct(product);
		    return ResponseEntity.ok("Product successfully added");
		}

	    @GetMapping("/all")
	    public List<Product> getAllProducts() {
	        return productService.getAllProducts();
	    }

	    @GetMapping("/{id}")
	    public Product getProductById(@PathVariable("id") Long id) {
	        return productService.getProductById(id);
	    }

	    @PutMapping("/{id}")
	    public String updateProduct(@PathVariable("id") Long id, @RequestBody Product product) {
	        return productService.updateProduct(id, product);
	    }

	    @DeleteMapping("/{id}")
	    public String deleteProductById(@PathVariable("id") Long id) {
	        return productService.deleteProductById(id);
	    }

	    @GetMapping("/pageination")
	    public Page<Product> getPaginatedProducts(
	            @RequestParam(name = "page", defaultValue = "0") int page,
	            @RequestParam(name = "size", defaultValue = "5") int size) {
	        Pageable pageable = PageRequest.of(page, size);
	        return productService.getPaginatedProducts(pageable);
	    }
}
