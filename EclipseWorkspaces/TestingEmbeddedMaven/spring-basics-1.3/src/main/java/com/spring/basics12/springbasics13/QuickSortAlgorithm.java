package com.spring.basics12.springbasics13;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

//Primary annotation tells spring to use this class first instead of
//the bubble sort class
@Primary

public class QuickSortAlgorithm implements SortAlgorithm{
	
	public int[] sort(int[] numbers) {
		
		//Logic
		
		return numbers;
	}
}
