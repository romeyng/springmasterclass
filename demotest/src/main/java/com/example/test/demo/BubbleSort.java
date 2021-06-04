package com.example.test.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary

public class BubbleSort implements SortAlgorithm {

    public int[] sort(int[] numbers){
        System.out.println("BubbleSorting");

        return numbers;
    }
}
