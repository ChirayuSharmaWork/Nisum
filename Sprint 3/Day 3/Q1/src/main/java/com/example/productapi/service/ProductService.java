package com.example.productapi.service;

import com.example.productapi.model.Product;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {
    private final Map<Integer, Product> productRepo = new HashMap<>();

    public List<Product> getAllProducts() {
        return new ArrayList<>(productRepo.values());
    }

    public Product getProductById(int id) {
        return productRepo.get(id);
    }

    public Product addProduct(Product product) {
        productRepo.put(product.getId(), product);
        return product;
    }

    public Product updateProduct(int id, Product updatedProduct) {
        productRepo.put(id, updatedProduct);
        return updatedProduct;
    }

    public void deleteProduct(int id) {
        productRepo.remove(id);
    }
}