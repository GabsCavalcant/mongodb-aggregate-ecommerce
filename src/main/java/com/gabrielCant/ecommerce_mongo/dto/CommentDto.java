/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gabrielCant.ecommerce_mongo.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author gabri
 */

public class CommentDto implements Serializable{
private static final long serialVersionUID = 1L;
    

    private String text;
    private Date data;
    private AuthorDto author; 
    
   
    
    public CommentDto(){
        
    }

    public CommentDto(String text, Date data, AuthorDto author) {
        this.text = text;
        this.data = data;
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public AuthorDto getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDto author) {
        this.author = author;
    }
    
    
   
    
    
}
