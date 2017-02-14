package com.mobilhanem;
import org.springframework.context.annotation.*;

@Configuration
public class HelloSpringConfiguration {
	   
	@Bean 
	public HelloSpring helloWorld(){
      return new HelloSpring();
    }
	
}
