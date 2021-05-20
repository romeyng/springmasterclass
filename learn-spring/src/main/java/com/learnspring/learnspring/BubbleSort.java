package com.learnspring.learnspring;

import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements SortAlg {
    public int[] sort(int[] numbers) {
        System.out.println("Bubblesorting");
        return numbers;
    }
}
