package com.project.SpringBoot;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

//		ApplicationContext ac = SpringApplication.run(Application.class, args);
		ConfigurableApplicationContext ac = SpringApplication.run(Application.class, args);
		Dev dev = ac.getBean(Dev.class);
		dev.sayHello();
		dev.task();
	}

}
