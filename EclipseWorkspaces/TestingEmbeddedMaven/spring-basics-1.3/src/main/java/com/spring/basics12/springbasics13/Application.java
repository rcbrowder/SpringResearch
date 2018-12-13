package com.spring.basics12.springbasics13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
	
	//Purpose: Have a search algorithm that dynamically makes use of
	//either the bubble sort or quick sort depending on circumstance

	public static void main(String[] args) {
		
		//To use Spring:
			//What are the beans Spring has to manage?
				//Imported @Component to BinarySearchImpl and BubbleSortAlgorithm
			//What are the dependencies for a bean?
				//Imported @Autowired to BinarySearchImpl
			//Where to search for the beans?
				//No need - Spring Boot already did that
		
		//Application Context
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		
		int result = binarySearch.binarySearch(new int[] {12,4,6}, 3);
		
		System.out.println(result);
		
	}

}

