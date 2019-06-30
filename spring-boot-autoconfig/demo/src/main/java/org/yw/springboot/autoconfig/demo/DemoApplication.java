package org.yw.springboot.autoconfig.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yw.springboot.yanstarter.GreetingService;

@SpringBootApplication
public class DemoApplication {




	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

}
