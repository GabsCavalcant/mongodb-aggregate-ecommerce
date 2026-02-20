/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gabrielCant.ecommerce_mongo.repository;

import com.gabrielCant.ecommerce_mongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gabri
 */

//Extend Repositorio  do MongoDb1
@Repository 
public interface UserRepository extends MongoRepository<User, String>{
    
}
