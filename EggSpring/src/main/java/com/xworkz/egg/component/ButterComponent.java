package com.xworkz.egg.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ButterComponent {
    public ButterComponent() {
        System.out.println("const of ButterComponent");
    }
    @RequestMapping("/butter")
    public String getButter(){
        System.out.println("getButter method");
        return "butter.jsp";
    }
}
