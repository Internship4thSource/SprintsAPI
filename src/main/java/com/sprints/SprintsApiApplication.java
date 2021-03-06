package com.sprints;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SprintsApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(SprintsApiApplication.class, args);
		    
	}
	
	@Configuration
	public static class WebMvcConfig implements WebMvcConfigurer  {	

	}
}
