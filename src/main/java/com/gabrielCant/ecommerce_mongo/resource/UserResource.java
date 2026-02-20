/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gabrielCant.ecommerce_mongo.resource;

import com.gabrielCant.ecommerce_mongo.domain.User;
import com.gabrielCant.ecommerce_mongo.dto.UserDto;
import com.gabrielCant.ecommerce_mongo.service.UserService;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


/**
 *
 * @author gabri
 */
//ResponseEntity para retornar uma sinal http válido
@RestController
@RequestMapping(value = "/users")
public class UserResource {
    
    @Autowired
    private UserService service;

    @GetMapping // @GetMapping
    public ResponseEntity<List<UserDto>> findAll() {
        List<User> list = service.findAll();
        List<UserDto> listaDto = list.stream().map(x -> new UserDto(x)).collect(Collectors.toList());
        
        return ResponseEntity.ok().body(listaDto);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDto> findAll(@PathVariable String id ) {
        
        User user = service.findById(id);
        
        return ResponseEntity.ok().body(new UserDto(user));
    }
    
    @PostMapping()
    public ResponseEntity<Void> insert(@RequestBody UserDto userDto ) {
        
        User user = service.fromDto(userDto);
        
        user = service.insert(user);
        
        URI uri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/{id}").buildAndExpand(user.getId()).toUri();
        
        return ResponseEntity.created(uri).build();
    }
    
}
