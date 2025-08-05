package com.xworkz.egg.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class BiriyaniComponent {
    public BiriyaniComponent(){
        System.out.println("Running BiriyaniComponent constructor");
    }

    @RequestMapping("/biriyani")
    public String getBiriyani(){
        System.out.println("getBiriyani method");
        return "biriyani.jsp";
    }
}
