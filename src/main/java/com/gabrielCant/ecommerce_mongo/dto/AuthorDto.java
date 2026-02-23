/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gabrielCant.ecommerce_mongo.dto;

import com.gabrielCant.ecommerce_mongo.domain.User;
import java.io.Serializable;

/**
 *
 * @author gabri
 */
public class AuthorDto implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String id;
    private String name;
    
    public AuthorDto(){
    }
    
    public AuthorDto(User obj){
        id = obj.getId();
        name = obj.getName();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
