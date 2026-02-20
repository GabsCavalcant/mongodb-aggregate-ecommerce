/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gabrielCant.ecommerce_mongo.service;

import com.gabrielCant.ecommerce_mongo.domain.User;
import com.gabrielCant.ecommerce_mongo.repository.UserRepository;
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
public class UserService {
    
    @Autowired
    private UserRepository repo;
    
    public List<User> findAll(){
        return repo.findAll();
    }
    
    public User findById(String id){
       Optional<User> obj = repo.findById(id);
        
       return obj.orElseThrow(() -> new ObjectNotFound("Object not found / Objeto não encontrado."));
    
}
}