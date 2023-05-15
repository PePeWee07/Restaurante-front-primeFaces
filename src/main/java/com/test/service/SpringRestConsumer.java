/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.service;

import com.test.pojo.Promociones;
import com.test.pojo.Proveedores;
import java.util.List;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author pepew
 */
public class SpringRestConsumer {
    
    private RestTemplate restTemplate= new RestTemplate();
            
    public List<?> consumeApi(String busqueda) {
        String url = "http://localhost:8872/api" + busqueda; // Cambia la URL para que coincida con tu API REST de Spring}
        List<?> servidores = restTemplate.getForObject(url, List.class);
        //String response = restTemplate.getForObject(url, String.class);  
        return servidores;
    }
    
    
}
