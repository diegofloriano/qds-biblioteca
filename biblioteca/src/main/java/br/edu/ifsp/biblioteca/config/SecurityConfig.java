package br.edu.ifsp.biblioteca.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
  @Bean
  SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
      .csrf(csrf -> csrf.disable())
      .headers(h -> h.frameOptions(f -> f.disable()))

      .authorizeHttpRequests(auth -> auth
        .requestMatchers(
          "/demo/v1/h2-console/**",
          "/demo/v1/swagger-ui/**",
          "/v3/api-docs/**",
          "/demo/v1/**"
        ).permitAll()

        .requestMatchers("/h2-console/**", "/swagger-ui/**").permitAll()

        .anyRequest().permitAll()
      );

    return http.build();
  }
}
