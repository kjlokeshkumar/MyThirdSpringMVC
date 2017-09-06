/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lokesh.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author reksl
 */
@Controller
public class HelloRekhaController {
   
    @RequestMapping(value = "/hello.do")
    public ModelAndView sayHelloRekha() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello Rekha!");
        mv.setViewName("helloRekha");
        return mv;
    }
}
