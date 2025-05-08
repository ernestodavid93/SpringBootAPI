package com.apidebian.apidebian.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apidebian.apidebian.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
