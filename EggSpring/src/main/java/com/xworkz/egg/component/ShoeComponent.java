package com.xworkz.egg.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ShoeComponent {
    public ShoeComponent(){
        System.out.println("Constructor of ShoeComponent");
    }
    @RequestMapping("/shoe")
    public String getShoe(){
        System.out.println("getShoe method");
        return "shoe.jsp";
    }
}
