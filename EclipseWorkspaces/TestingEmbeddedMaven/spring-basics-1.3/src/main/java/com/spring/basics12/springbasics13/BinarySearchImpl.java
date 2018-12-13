package com.spring.basics12.springbasics13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}



	public int binarySearch(int[] numbers, int searchingFor) {
		
		//Sort array
		
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		
		
		//Search array
		
		//Return result
		
		return 3;
	}
	
	

}
