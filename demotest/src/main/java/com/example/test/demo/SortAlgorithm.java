package com.example.test.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;


public interface SortAlgorithm {
    public int[] sort(int[] numbers);
}
