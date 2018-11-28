package com.rick.demologicweb;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

        @Override
        public void addViewControllers(ViewControllerRegistry registry){
            registry.addViewController("/logic/index").setViewName("login");
            registry.addViewController("/logic/register.do").setViewName("register");
            registry.addViewController("/logic/goToUpload.do").setViewName("upload");
        }

}