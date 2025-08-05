package com.xworkz.egg.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class OnionComponent {
    public OnionComponent(){
        System.out.println("Constructor of OnionComponent");
    }
    @RequestMapping("/onion")
    public String getOnion(){
        System.out.println("getOnion method");
        return "onion.jsp";
    }
}
