package com.ict.edu3.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ResourceConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/upload/**") // URL 경로
                .addResourceLocations("file:C:/Users/thrud/Documents/upload/")
                .setCachePeriod(3600); // 캐시 기간(초)
    }
}