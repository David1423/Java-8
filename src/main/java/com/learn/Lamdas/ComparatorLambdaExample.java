package com.learn.Lamdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {

        /*
         *  implementation prior to java 8
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println(comparator.compare(5,4));


        /*
         * implementation wrt Java 8 Lambda Expressions
         */

        Comparator<Integer> comparator1 = (a,b) -> a.compareTo(b);

        System.out.println(comparator1.compare(8,9));


    }//main(-)
}
