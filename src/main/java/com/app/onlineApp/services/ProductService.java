package com.app.onlineApp.services;

import com.app.onlineApp.models.Product;
import com.app.onlineApp.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<Product> getAllProducts(){
       return productRepository.findAll();
    }
    public List<Product> getProductByCategory(Long categodyId){
        return productRepository.findByCategoryId(categodyId);

    }
}
