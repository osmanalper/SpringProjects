package com.mobilhanem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mobilhanem.config.HelloSpringConfiguration;

class Main {

	private static ApplicationContext context;

	public static void main(String[] args) {

		context = new AnnotationConfigApplicationContext(HelloSpringConfiguration.class);

		HelloSpring helloSpringObject = context.getBean(HelloSpring.class);

		helloSpringObject.setMessage("Hello World!");
		helloSpringObject.getMessage();

	}

}
