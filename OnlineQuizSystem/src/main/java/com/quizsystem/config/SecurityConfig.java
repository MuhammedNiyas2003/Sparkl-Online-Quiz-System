package com.quizsystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .cors() // Enable CORS
            .and()
            .csrf().disable() // Disable CSRF for APIs
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/**").permitAll() // Allow access to API endpoints
                .anyRequest().authenticated() // Protect other endpoints
            );
        return http.build();
    }
}
