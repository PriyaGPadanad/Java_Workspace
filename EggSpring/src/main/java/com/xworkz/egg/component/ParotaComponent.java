package com.xworkz.egg.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ParotaComponent {
    public ParotaComponent(){
        System.out.println("Constructor of ParotaComponent");
    }
    @RequestMapping("/parota")
    public String getParota(){
        System.out.println("getParota method");
        return "parota.jsp";
    }
}
