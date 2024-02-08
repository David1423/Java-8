package com.learn.streams;

import com.learn.functionalInterfaces.Student;
import com.learn.functionalInterfaces.StudentDAO;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
//reduce() method of streams is used to reduce the contents of the stream to a single value

    public static int performMultiplication(List<Integer> integer){
        return integer.stream()
                .reduce(1,(a,b)->a*b);
        //can also use this overloaded method "reduce((a,b)->a*b)" without identity which returns Optional<>

        // Initial value is 1(first param), => a=1,b=1 => 1*1=1, now a = 1, b=3 => 1*3 = 3 and so on.
        //  on the first iteration it takes the identity value for a and first element into b i.e. 1=> a=1(identity),b=1(from list)

        //here passing the list of 1,3,5,7,9 to the method
        //creating a stream and passing to reduce method
        //which is taking two arguments first param: identity (default value or initial value)
        //second param: BinaryOperator<> taking the elements and do some operation like sum or mul or min or max etc. and
        //returns the single value result.
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integers){
         return integers.stream().reduce((a,b)->a*b); //Here reduce method with single parameter (without Identity parameter)
    }

    public static Optional<Student> getHighestGPAStudent(){
        return StudentDAO.getAllStudents()
                .stream()
                .reduce( (s1,s2) -> s1.getGpa()>s2.getGpa() ? s1 : s2);
    }

    public static void main(String[] args) {
        List<Integer>   integers = Arrays.asList(1,3,5,7,9);
        System.out.println(performMultiplication(integers));

        Optional<Integer> result = performMultiplicationWithoutIdentity(integers);

        if(result.isPresent()){
            System.out.println(result.get());
        }


    Optional<Student> result1 = getHighestGPAStudent();
        if(result1.isPresent()){
            System.out.println(result1.get());
        }
    }
}
