/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gabrielCant.ecommerce_mongo.resource;

import com.gabrielCant.ecommerce_mongo.domain.Post;
import com.gabrielCant.ecommerce_mongo.resource.util.URL;
import com.gabrielCant.ecommerce_mongo.service.PostService;
import static com.mongodb.client.model.Filters.text;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gabri
 */
//ResponseEntity para retornar uma sinal http válido
@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService service;

   

    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {

        Post user = service.findById(id);

        return ResponseEntity.ok().body(user);
    }
    
    
    @GetMapping(value = "/titlesearch")
    public ResponseEntity<List<Post>> findByTitle(@RequestParam(value = "text", defaultValue = "") String text) {

        text = URL.decodeParam(text);
        
        List<Post> list = service.findByTittle(text);

        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value = "/fullsearch")
    public ResponseEntity<List<Post>> fullSearch(
            @RequestParam(value = "text", defaultValue = "") String text,
                    //Data minima o sistema
            @RequestParam(value = "minDate", defaultValue = "2000-01-01") String minDate,
            @RequestParam(value = "max", defaultValue = "") String maxDate) {

        text = URL.decodeParam(text);
        Date min = URL.convertDate(minDate ,new Date(0L));
        Date max = URL.convertDate(maxDate ,new Date());
        
        System.out.println("=== DEBUG BUSCA ===");
    System.out.println("Texto: " + text);
    System.out.println("Data Min: " + min);
    System.out.println("Data Max: " + max);
        
        List<Post> list = service.fullSearch(text,min,max);

        return ResponseEntity.ok().body(list);
    }
}
