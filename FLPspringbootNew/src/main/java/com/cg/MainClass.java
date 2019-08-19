package com.cg;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
@CrossOrigin("*")
@SpringBootApplication
public class MainClass {
	public static void main(String[] args) {
		SpringApplication.run(MainClass.class, args);
		System.out.println("Running at port 3000");

	}

	
	 @Bean
	 public CorsFilter corsFilter() {
	 UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	 CorsConfiguration config = new CorsConfiguration();
	 config.setAllowCredentials(true);
	 config.addAllowedOrigin("*");
	 config.addAllowedHeader("*");
	 config.addAllowedMethod("OPTIONS");
	 config.addAllowedMethod("GET");
	 config.addAllowedMethod("POST");
	 config.addAllowedMethod("PUT");
	 config.addAllowedMethod("DELETE");
	 
	 
	 source.registerCorsConfiguration("/**", config);
	 return new CorsFilter();
	 }

}
