/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gabrielCant.ecommerce_mongo.service.exception;

/**
 *
 * @author gabri
 */
public class ObjectNotFound extends RuntimeException{
    private static final long serialVersionUID = 1L;
    
    public ObjectNotFound(String mensagem){
        super(mensagem);
    }
    
}
