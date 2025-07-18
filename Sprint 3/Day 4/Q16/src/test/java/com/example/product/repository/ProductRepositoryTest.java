package com.example.product.repository;

import com.example.product.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository repo;

    @Test
    void testFindByCategory() {
        repo.save(new Product("Phone", "Smartphone", BigDecimal.valueOf(500), 10, "Electronics", null, null));
        List<Product> result = repo.findByCategory("Electronics");
        assertThat(result).isNotEmpty();
    }

    @Test
    void testFindByPriceBetween() {
        repo.save(new Product("Laptop", "Gaming", BigDecimal.valueOf(1500), 5, "Electronics", null, null));
        List<Product> result = repo.findByPriceBetween(BigDecimal.valueOf(1000), BigDecimal.valueOf(2000));
        assertThat(result).isNotEmpty();
    }

    @Test
    void testFindByNameContainingIgnoreCase() {
        repo.save(new Product("Tablet", "Android", BigDecimal.valueOf(300), 15, "Electronics", null, null));
        List<Product> result = repo.findByNameContainingIgnoreCase("tablet");
        assertThat(result).hasSize(1);
    }

    @Test
    void testSearchByNameAndCategory() {
        repo.save(new Product("TV", "LED", BigDecimal.valueOf(800), 7, "Home", null, null));
        List<Product> result = repo.searchByNameAndCategory("tv", "Home");
        assertThat(result).hasSize(1);
    }
}
