/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here

package com.example.nxttrendz1.repository;

import java.util.ArrayList;
import com.example.nxttrendz1.model.Product;

public interface ProductRepository {

    public ArrayList<Product> getProducts();
}