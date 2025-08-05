package com.xworkz.egg.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.xworkz.egg")
public class EggConfiguration {
    public EggConfiguration(){
        System.out.println("Constructor of EggConfiguration");
    }
}
