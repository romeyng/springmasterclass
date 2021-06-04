package com.example.test.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class BinarySearch {



    //Autowiring the sortAlgorithm makes a loose coupling in that the default can be set from the the algorithm class
    @Autowired
    private SortAlgorithm sortAlgorithm;

    public SortAlgorithm getSortAlgorithm() {
        return sortAlgorithm;
    }
   

    public int[] binarySearch(int [] numbers, int num){
        //Instantiating sort algorithm object creates tight coupling of the BinarySearch with the SortAlgorithm
        //If you wanted to change the algorithm, you would have to change code here to implement the other alg.
        //BubbleSort bub = new BubbleSort();
        //int [] sorted = bub.sort((numbers));



        int [] sorted = sortAlgorithm.sort((numbers));
        System.out.println("Sortalgo: "+ sortAlgorithm);

        return sorted;
    }


}
