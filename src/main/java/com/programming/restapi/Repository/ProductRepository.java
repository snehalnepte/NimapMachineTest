package com.programming.restapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programming.restapi.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
