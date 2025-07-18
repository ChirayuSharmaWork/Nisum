package com.example.productdashboard.repository;

import com.example.productdashboard.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testFindByCategory() {
        Product p = new Product();
        p.setName("TV");
        p.setCategory("Electronics");
        p.setPrice(BigDecimal.valueOf(500));
        productRepository.save(p);

        List<Product> results = productRepository.findByCategory("Electronics");
        assertEquals(1, results.size());
    }
}