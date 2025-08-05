package com.xworkz.egg.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class SockComponent {
    public SockComponent(){
        System.out.println("Constructor of SockComponent");
    }
    @RequestMapping("/sock")
    public String getSock(){
        System.out.println("getSock method");
        return "sock.jsp";
    }
}
