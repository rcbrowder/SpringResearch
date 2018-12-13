package com.spring.basics12.springbasics13;

public class BinarySearchImpl {
	
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
