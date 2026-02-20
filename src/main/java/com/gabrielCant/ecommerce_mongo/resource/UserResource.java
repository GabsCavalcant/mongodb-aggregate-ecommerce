/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gabrielCant.ecommerce_mongo.resource;

import com.gabrielCant.ecommerce_mongo.domain.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author gabri
 */

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    
    @GetMapping
    
    //ResponseEntity para retornar uma sina http válido
    public ResponseEntity <List<User>> findall (){
        User gab = new User("1", "Gabriel", "Gabriel@gmail");
        User sthe = new User("2", "Sthe", "Sthe@gmail");
        
       List<User> list = new ArrayList<>();
       
       list.addAll(Arrays.asList(gab,sthe));
       
       return ResponseEntity.ok().body(list);
       
       
    }
    
}
