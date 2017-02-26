package com.mobilhanem.config;

import org.springframework.context.annotation.*;

import com.mobilhanem.HelloSpring;

@Configuration
public class HelloSpringConfiguration {

	@Bean
	public HelloSpring createHelloSpringBean() {
		return new HelloSpring();
	}

}
