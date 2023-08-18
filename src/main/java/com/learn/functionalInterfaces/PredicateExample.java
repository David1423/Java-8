package com.learn.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> predicateGreaterThan10 = num -> num>10;
    static Predicate<Integer> predicateIsMultipleOf2 = num-> num%2==0;

    public static void main(String[] args) {

        System.out.println("predicate Greater than 10 : "+predicateGreaterThan10.test(2));
        System.out.println("predicate is multiple of 2 : "+predicateIsMultipleOf2.test(10));

        System.out.println("Predicate and Method : "+predicateAnd());
        System.out.println("Predicate or Method : "+predicateOr());
        System.out.println("Predicate Negate Method : "+predicateNegate());

    }

    static boolean predicateAnd(){
        return predicateIsMultipleOf2.and(predicateGreaterThan10).test(10);
    }


    static boolean predicateOr(){
        return predicateIsMultipleOf2.or(predicateGreaterThan10).test(4);
    }

    static boolean predicateNegate(){
        return predicateIsMultipleOf2.negate().test(5);
    }
}
