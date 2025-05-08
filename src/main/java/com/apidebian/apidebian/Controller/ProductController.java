package com.apidebian.apidebian.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apidebian.apidebian.Model.Product;
import com.apidebian.apidebian.Repository.ProductRepository;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @RequestMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

}
