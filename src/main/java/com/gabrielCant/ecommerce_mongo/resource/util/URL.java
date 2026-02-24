/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gabrielCant.ecommerce_mongo.resource.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.logging.Logger;

/**
 *
 * @author gabri
 */
public class URL {
    
    public static String decodeParam(String texto){
        try {
            return URLDecoder.decode(texto, "UTF8");
        } catch (UnsupportedEncodingException ex) {
            return "";
        }
                
    }
    
}
