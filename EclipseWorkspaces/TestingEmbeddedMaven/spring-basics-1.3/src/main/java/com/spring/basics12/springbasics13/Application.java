package com.spring.basics12.springbasics13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		BinarySearchImpl binarySearch = new BinarySearchImpl();
		
		int result = binarySearch.binarySearch(new int[] {12,4}, 3);
		
		System.out.println(result);
		
		SpringApplication.run(Application.class, args);
	}

}

