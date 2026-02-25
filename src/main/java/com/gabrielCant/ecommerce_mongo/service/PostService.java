/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gabrielCant.ecommerce_mongo.service;

import com.gabrielCant.ecommerce_mongo.domain.Post;
import com.gabrielCant.ecommerce_mongo.repository.PostRepository;
import com.gabrielCant.ecommerce_mongo.service.exception.ObjectNotFound;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gabri
 */
@Service
public class PostService {
    
    @Autowired 
    private PostRepository repo;
    
    public Post findById(String id){
        Optional<Post> obj = repo.findById(id);
        
        return obj.orElseThrow(() -> new ObjectNotFound("Objeto Não encontrado!"));
    }
    
    public List<Post> findByTittle(String txt){
        return repo.titlesearch(txt);
    }
    
}
