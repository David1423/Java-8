package com.learn.streams;

import com.learn.functionalInterfaces.Student;
import com.learn.functionalInterfaces.StudentDAO;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamFlatMap {
    public static void main(String[] args) {
        System.out.println("Activities of all students : "+ getAllStudentActivities());
        System.out.println("Distinct Activities of all students : "+getDistinctStudentActivities());
        System.out.println("No. of all the distinct activities of the students : "+ getStudentActivitiesCount());
        System.out.println("Activities of all students in sorted order : "+ getStudentActivitiesBySortedOrder());
    }

    public static List<String> getAllStudentActivities() {
        return StudentDAO.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream) // flattens all the nested list or collections into a single stream.
                .collect(toList()); // Accumulating the stream into a list
    }

    // using distinct() method to retrieve the distinct elements form the list.

    public static List<String> getDistinctStudentActivities(){
        return StudentDAO.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct() //gives the distinct elements from the given list of elements
                .collect(toList()); //can also use '.collect(toSet())' without using the 'distinct()', but should change the return type Set<String>
    }

    public static long getStudentActivitiesCount(){
     return StudentDAO.getAllStudents().stream()
             .map(Student::getActivities)
             .flatMap(List::stream)
             .distinct() // return Stream<String> with distinct operation performed,
             .count(); // give the no. of elements in the stream.
    }

    public static List<String> getStudentActivitiesBySortedOrder(){
        return StudentDAO.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted() // sorts in natural ordering
                .collect(toList()); // or '.toList()'
    }


}



