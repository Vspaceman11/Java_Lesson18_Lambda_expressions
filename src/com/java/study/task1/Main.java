package com.java.study.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int list = Arrays.asList(32, 45, 12, 23, 11, 3, 4, 6, 17, 21)
                .stream()
                .mapToInt(x-> x*x)
                .reduce(0, ((a, b) -> (a + b)));
        System.out.println(list);
    }
}
