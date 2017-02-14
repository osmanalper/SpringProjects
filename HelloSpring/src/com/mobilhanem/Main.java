package com.mobilhanem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Main {

	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		HelloSpring helloSpringObject = (HelloSpring) context.getBean("helloSpring");

		helloSpringObject.getMessage();

	}

}
