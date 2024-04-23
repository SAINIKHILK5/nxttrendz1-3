/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.http.HttpStatus;
 * import org.springframework.stereotype.Service;
 * import org.springframework.web.server.ResponseStatusException;
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 */

// Write your code here

package com.example.nxttrendz1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import com.example.nxttrendz1.repository.*;
import com.example.nxttrendz1.model.Product;

@Service
public class ProductJpaService implements ProductRepository {
    @Autowired
    private ProductJpaRepository pr;

    @Override

    public ArrayList<Product> getProducts() {

        List<Product> l1 = pr.findAll();
        ArrayList<Product> a1 = new ArrayList<>(l1);
        return a1;
    }
}