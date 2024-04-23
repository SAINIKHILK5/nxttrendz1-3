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
import com.example.nxttrendz1.model.Review;
import com.example.nxttrendz1.service.ReviewJpaService;

@RestController
public class ReviewController {

    @Autowired

    public ReviewJpaService rs1;

    @GetMapping("/reviews")
    public ArrayList<Review> getReviews() {
        return rs1.getReviews();
    }
}