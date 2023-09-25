package com.lottery.lotoapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfigurationSource;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.cors(Customizer.withDefaults())
			.authorizeHttpRequests((requests) -> requests
				.requestMatchers("/lotofacil/recrutador/**").permitAll()
				.requestMatchers("/lotofacil/recrutador/historico").permitAll()
				.requestMatchers("/megasena/recrutador/**").permitAll()
				.requestMatchers("/megasena/recrutador/historico").permitAll()
				.anyRequest().authenticated()
			)
			.oauth2Login(Customizer.withDefaults());
			
		return http.build();
    }

}