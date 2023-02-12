package com.java.study.task3;

public class Main {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        Calculator dev = (a, b) -> a / b;
        Calculator mul = (a, b) -> a * b;

        System.out.println(add.calc(2,3));
        System.out.println(sub.calc(2,3));
        System.out.println(dev.calc(2,3));
        System.out.println(mul.calc(2,3));
    }
}
