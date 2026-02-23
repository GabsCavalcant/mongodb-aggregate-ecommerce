/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gabrielCant.ecommerce_mongo.domain;

import com.gabrielCant.ecommerce_mongo.dto.AuthorDto;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author gabri
 */

@Document(value = "post")
public class Post implements Serializable{
private static final long serialVersionUID = 1L;
    
    @Id
    private String id;
    private Date date;
    private String tittle;
    private String body;
    private AuthorDto autor;
    
    public Post(){
        
    }

    public Post(String id, Date date, String tittle, String body, AuthorDto autor) {
        this.id = id;
        this.date = date;
        this.tittle = tittle;
        this.body = body;
        this.autor = autor;
    }

    public String getId() {
        return id;
    }

    public AuthorDto getAutor() {
        return autor;
    }

    public void setAutor(AuthorDto autor) {
        this.autor = autor;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Post other = (Post) obj;
        return Objects.equals(this.id, other.id);
    }
    
    
    
}
