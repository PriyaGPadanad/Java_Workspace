package com.xworkz.egg.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class CurryComponent {
    public CurryComponent(){
        System.out.println("Constructor of CurryComponent");
    }
    @RequestMapping("/curry")
    public String getCurry(){
        System.out.println("getCurry method");
        return "curry.jsp";
    }
}
