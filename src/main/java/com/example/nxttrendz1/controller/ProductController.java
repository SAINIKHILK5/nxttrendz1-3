/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here

package com.example.nxttrendz1.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.nxttrendz1.service.ProductJpaService;
import com.example.nxttrendz1.model.Product;

@RestController
public class ProductController {

    @Autowired
    private ProductJpaService ps;

    @GetMapping("/products")

    public ArrayList<Product> getProducts() {
        return ps.getProducts();
    }
}