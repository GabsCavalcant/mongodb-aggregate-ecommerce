/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gabrielCant.ecommerce_mongo.repository;

import com.gabrielCant.ecommerce_mongo.domain.Post;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gabri
 */
@Repository 
public interface PostRepository  extends MongoRepository<Post, String>{
    
    @Query("{ 'title': { $regex: ?0, $options: 'i' } }")
    List<Post> titlesearch(String text);
    
     List<Post> findByTitleContainingIgnoreCase(String txt);
        
   
    
}
