package com.klu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.klu.model.Product;
import com.klu.repository.ProductRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepo repository = null;

    // Save Product
    public Product save(Product product) {
        return repository.save(product);
    }

    // Get products by category
    public List<Product> getByCategory(String category) {
        return repository.findByCategory(category);
    }

    // Filter products by price range
    public List<Product> filterByPrice(double min, double max) {
        return repository.findByPriceBetween(min, max);
    }

    // Get products sorted by price
    public List<Product> getSortedProducts() {
        return repository.sortProductsByPrice();
    }

    // Get products with price greater than given value
    public List<Product> getExpensiveProducts(double price) {
        return repository.findExpensiveProducts(price);
    }
}