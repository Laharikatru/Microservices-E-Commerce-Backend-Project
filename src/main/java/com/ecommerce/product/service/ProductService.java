package com.ecommerce.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.product.model.Product;
import com.ecommerce.product.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    // Get all products
    public List<Product> getAllProducts(){
        return repository.findAll();
    }

    // Save product
    public Product saveProduct(Product product){
        return repository.save(product);
    }

    // Get product by id
    public Product getProductById(Long id){
        return repository.findById(id).orElse(null);
    }

    // Update product
    public Product updateProduct(Long id, Product product){

        return repository.findById(id)
                .map(existing -> {
                    existing.setName(product.getName());
                    existing.setPrice(product.getPrice());
                    return repository.save(existing);
                })
                .orElseThrow(() -> new RuntimeException("Product not found with id " + id));
    }

    // Delete product
    public void deleteProduct(Long id){
        repository.deleteById(id);
    }
}