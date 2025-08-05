package com.xworkz.egg.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class EggInitConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer {

    public EggInitConfiguration(){
        System.out.println("Constructor of EggInitConfiguration");
    }
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{EggConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/soap","/butter","/bottle","/shoe","/chappal","/socks","/chutney","/onion","/milk","/curry","/biriyani","/parota","/egg"};
    }
}
