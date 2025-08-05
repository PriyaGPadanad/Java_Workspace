package com.xworkz.egg.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class SoapComponent {
    public SoapComponent(){
        System.out.println("Constructor of SoapComponent");
    }
    @RequestMapping("/soap")
    public String getSoap(){
        System.out.println("getSoap method");
        return "soap.jsp";
    }
}
