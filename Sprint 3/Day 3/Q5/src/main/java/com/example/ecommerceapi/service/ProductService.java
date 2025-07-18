package com.example.ecommerceapi.service;

import com.example.ecommerceapi.model.Product;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ProductService {
    private final Map<Integer, Product> productRepo = new HashMap<>();

    public List<Product> getAll(String category, Double minPrice, Double maxPrice,
                                String sortBy, String sortDir, int page, int size) {
        return productRepo.values().stream()
                .filter(p -> category == null || p.getCategory().equalsIgnoreCase(category))
                .filter(p -> minPrice == null || p.getPrice() >= minPrice)
                .filter(p -> maxPrice == null || p.getPrice() <= maxPrice)
                .sorted((p1, p2) -> {
                    if ("desc".equalsIgnoreCase(sortDir)) {
                        return Double.compare(p2.getPrice(), p1.getPrice());
                    }
                    return Double.compare(p1.getPrice(), p2.getPrice());
                })
                .skip((long) page * size)
                .limit(size)
                .collect(Collectors.toList());
    }

    public Product getById(int id) {
        return productRepo.get(id);
    }

    public Product add(Product product) {
        productRepo.put(product.getId(), product);
        return product;
    }

    public Product update(int id, Product product) {
        productRepo.put(id, product);
        return product;
    }

    public void delete(int id) {
        productRepo.remove(id);
    }
}
