package com.learn.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static int findMaxValue(List<Integer> integerList){
        //x: default value(here it is 0(identity)) or max of x,y of that iteration
        //y: elements form the list.
        return integerList.stream()
                .reduce(0,(x,y) -> x>y ? x : y);
    }

    // we can use the above reduce to find the max value, but when it is to find max or min it is
    //better to use the reduce method that returns the Optional<>, because when the passed list is empty for the above
    // reduced method it returns 0 ( identity or default value ) as the min or max number which is not the desired result.

    public static Optional<Integer> findMaxValueWithOptional(List<Integer> integers){

        return integers.stream()
                .reduce((x,y)-> x>y ? x :y);
    }

    public static void main(String[] args) {

       // List<Integer> list = Arrays.asList(4,3,7,4,8,2,0);
        List<Integer> emptyList = new ArrayList();

        System.out.println("Max value: "+findMaxValue(emptyList));

        Optional<Integer> maxValueWithOptional = findMaxValueWithOptional(emptyList);

        if(maxValueWithOptional.isPresent()){
            System.out.println("Max value with Optional is: "+ maxValueWithOptional);
        }
        else{
            System.out.println("Max value is not present or List is Empty !");
        }

    }
}
