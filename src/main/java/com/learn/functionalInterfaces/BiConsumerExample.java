package com.learn.functionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    //public static

    public static void main(String[] args) {

        BiConsumer<Integer, Integer> add = (a, b) -> System.out.println("addition : " + (a + b));
        BiConsumer<Integer, Integer> mult = (a, b) -> System.out.println("Multiplication : " + (a * b));
        add.andThen(mult).accept(3, 4);

    }
}
