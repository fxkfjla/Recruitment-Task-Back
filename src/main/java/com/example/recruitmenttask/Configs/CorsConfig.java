package com.example.recruitmenttask.Configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig
{
    @Bean
    public CorsFilter corsFilter()
    {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin("*"); // Allow requests from any origin, you can restrict it to specific origins
        config.addAllowedMethod("*"); // Allow all HTTP methods
        config.addAllowedHeader("*"); // Allow all headers
        config.addExposedHeader("X-Total-Count"); // Expose X-Total-Count header
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}