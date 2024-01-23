package com.ggpsgeorge.spring_database_searching;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired ProductRepository productRepository;

    public List<Product> saveProducts(List<Product> products) {
        return productRepository.saveAll(products);
    }

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    public Product findProduct(Long id) {
        return productRepository.findProductById(id);
    }

    public List<Product> orderProductsByRate(){
        return productRepository.queryOrderProductsByRate();
    }
}
