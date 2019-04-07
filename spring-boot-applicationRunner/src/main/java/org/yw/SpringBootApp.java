package org.yw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp{

	public static void main(String[] args) {
		System.out.println("SpringBootApp is  starting ......");
		SpringApplication.run(SpringBootApp.class, args);
		System.out.println("SpringBootApp is  started ......");
	}
}
