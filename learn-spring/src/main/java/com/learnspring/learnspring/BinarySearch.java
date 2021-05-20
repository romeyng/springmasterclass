package com.learnspring.learnspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
	//Sorting an array
	//Search the array
	//return
	@Autowired
	private SortAlg sortAlg;

	public BinarySearch(SortAlg sortAlg){
		super();
		this.sortAlg = sortAlg;
	}

	public int binarySearch(int[] numbers, int searchnum ) {


		
		int[] sorted = sortAlg.sort(numbers);
		System.out.println(sortAlg);
		return 3;
	}
}
