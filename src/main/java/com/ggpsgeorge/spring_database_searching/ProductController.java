package com.ggpsgeorge.spring_database_searching;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/v1/store")
public class ProductController {

    @Autowired ProductService productService;

    @PostMapping("/products/add")
    public ResponseEntity<List<Product>> addProducts(@RequestBody List<Product> products){
        return ResponseEntity.ok().body(productService.saveProducts(products));
    }

    @GetMapping("/products/all")
    public ResponseEntity<List<Product>> getProducts() {
        return ResponseEntity.ok().body(productService.findAllProducts());
    }

    // JQPL 
    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable Long id){
        return ResponseEntity.ok().body(productService.findProduct(id));
    }

    // JPQL Sorting
    @GetMapping("/products/order-by-rate")
    public ResponseEntity<List<Product>> getOrderedProductsByRate() {
        return ResponseEntity.ok().body(productService.orderProductsByRate());
    }

    // JPQL Search products by title with LIKE
    // Pretending to be a search
    @GetMapping("/products/jpql-search={title}")
    public ResponseEntity<List<Product>> getSearchProductsByTitle(@PathVariable String title) {
        return ResponseEntity.ok().body(productService.searchProductByTitle(title));
    }

    // Native Search products by title with LIKE
    @GetMapping("/products/native-search={title}")
    public ResponseEntity<List<Product>> getNativeSearchProductsByTitle(@PathVariable String title) {
        return ResponseEntity.ok().body(productService.nativeSearchProductByTitle(title));
    }

}
