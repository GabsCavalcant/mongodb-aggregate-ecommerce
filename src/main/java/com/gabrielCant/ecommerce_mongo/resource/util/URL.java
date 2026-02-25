/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gabrielCant.ecommerce_mongo.resource.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author gabri
 */
public class URL {

    public static String decodeParam(String texto) {
        try {
            return URLDecoder.decode(texto, "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            return "";
        }

    }

    public static Date convertDate(String data, Date defaultValue) {

        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
        simpleDate.setTimeZone(TimeZone.getTimeZone("GMT"));

        try {
            return simpleDate.parse(data);
        } catch (ParseException e) {
            return defaultValue;
        }
    }

}
