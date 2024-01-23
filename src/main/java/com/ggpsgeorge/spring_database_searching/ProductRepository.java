package com.ggpsgeorge.spring_database_searching;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
    // JPQL Queries
    @Query("SELECT p FROM Product p WHERE p.id = (:id)")
    Product findProductById(@Param("id") Long id);

    @Query("SELECT p FROM Product p ORDER BY p.rating.rate DESC")
    List<Product> queryOrderProductsByRate();
    // END JPQL
}
