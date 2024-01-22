package com.ggpsgeorge.spring_database_searching;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
    // JPQL Queries
    @Query("SELECT p FROM Product p WHERE p.id = ?1")
    Product findProductById(Long id);
}
