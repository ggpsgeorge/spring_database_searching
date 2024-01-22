package com.ggpsgeorge.spring_database_searching;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDTO {
    Long id;
    String title;
    Long price;
    String description;
    String category;
    String image;
    RatingDTO rating;
}
