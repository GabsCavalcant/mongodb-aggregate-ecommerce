/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gabrielCant.ecommerce_mongo.resource.exception;

import com.gabrielCant.ecommerce_mongo.service.exception.ObjectNotFound;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 * @author gabri
 */
//Anotação para tratar possiveis eos nas minhas aquisições 
@ControllerAdvice
public class ResourceExceptionHandler {
    
    @ExceptionHandler(ObjectNotFound.class)
    public ResponseEntity<StandardError> objNotFound (ObjectNotFound e , HttpServletRequest request){
        
        HttpStatus status = HttpStatus.NOT_FOUND;
        
        
        StandardError err = new StandardError(System.currentTimeMillis(), status.value(), "Não encontrado.", e.getMessage(), request.getRequestURI());
        
        return ResponseEntity.status(status).body(err);
    }
    
}
