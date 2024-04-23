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

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.nxttrendz1.model.Review;
import com.example.nxttrendz1.repository.ReviewRepository;
import com.example.nxttrendz1.repository.ReviewJpaRepository;

@Service
public class ReviewJpaService implements ReviewRepository {
    @Autowired
    private ReviewJpaRepository rr;

    @Override
    public ArrayList<Review> getReviews() {
        List<Review> l2 = rr.findAll();
        ArrayList<Review> a2 = new ArrayList<>(l2);
        return a2;
    }
}