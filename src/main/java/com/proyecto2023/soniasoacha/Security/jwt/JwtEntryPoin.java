/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto2023.soniasoacha.Security.jwt;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class JwtEntryPoin implements AuthenticationEntryPoint{
    private final static Logger  logger = LoggerFactory.getLogger(JwtEntryPoin.class);

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, 
            AuthenticationException authException)throws IOException, ServletException {
        logger.error("Falló el metodo commence");
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
        
 }
       
     }
