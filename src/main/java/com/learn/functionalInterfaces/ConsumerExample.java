package com.learn.functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        Consumer<String> consumerExample = (string)-> System.out.println(string) ;
        consumerExample.accept("**** the string is passed to the accept method of FI Consumer !");
    }
}
