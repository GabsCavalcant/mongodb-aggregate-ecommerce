package com.gabrielCant.ecommerce_mongo.dto;

import com.gabrielCant.ecommerce_mongo.domain.User;
import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


public class UserDto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String name;
    private String mail;

    public UserDto() {}

    public UserDto(User user) {
        id = user.getId();
        name = user.getName();
        mail = user.getMail();
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

  
}