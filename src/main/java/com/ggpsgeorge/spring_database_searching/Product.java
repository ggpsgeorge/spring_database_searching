package com.ggpsgeorge.spring_database_searching;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    
    @Column(nullable = false)
    String title;

    @Column
    BigDecimal price;

    @Column(length = 2048)
    String description;

    @Column(nullable = false)
    String category;

    @Column
    String image;

    @Embedded
    Rating rating;
}
