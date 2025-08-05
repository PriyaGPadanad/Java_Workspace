package com.xworkz.egg.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class EggComponent {
    public EggComponent(){
        System.out.println("Constructor of EggComponent");
    }
    @RequestMapping("/egg")
    public String getEgg(){
        System.out.println("getEgg method");
        return "egg.jsp";
    }

}
