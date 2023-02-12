package com.java.study.task2;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("J.Orwell","1984", 10.99);
        Book book2 = new Book("V.Ananyev","Slidy na dorozi", 9.99);
        Display display1 = new Display() {
            @Override
            public void show() {
                System.out.println(book1);
            }
        };
        Display display2 = () -> System.out.println(book2);
        display1.show();
        display2.show();
    }
}
