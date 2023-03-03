package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;


@SpringBootApplication
public class DemoApplication {

	
	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	public RestTemplate resttemplate()
	{
		return new RestTemplate();
	}
	
}
