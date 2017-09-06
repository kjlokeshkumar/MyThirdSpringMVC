/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lokesh.springmvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 *
 * @author reksl
 */
@Configuration
@ComponentScan(basePackages ={"com.lokesh.springmvc"})
public class SpringConfiguration {
    
    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver(){
      InternalResourceViewResolver view = new InternalResourceViewResolver();
      view.setPrefix("/WEB-INF/pages/");
      view.setSuffix(".jsp");
      return view;
    }
    
}
