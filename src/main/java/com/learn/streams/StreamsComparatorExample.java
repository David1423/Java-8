package com.learn.streams;

import com.learn.functionalInterfaces.Student;
import com.learn.functionalInterfaces.StudentDAO;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamsComparatorExample {
    //sorted(Comparator<>)

    public static List<Student> sortStudentsByName(){
        return StudentDAO.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(toList());
    }
    public static List<Student> sortStudentByGpa(){
        return StudentDAO.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa)) // the argument returns the comparator that compares the student obj by their GPA
                .collect(toList());
    }

    public static List<Student> sortStudentByGpaDesc(){
        return StudentDAO.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(toList());
    }
    
    public static void main(String[] args) {

        System.out.println("Sorting students by Names: \n"+ sortStudentsByName());
        System.out.println("Sorting Students by GPA: \n"+sortStudentByGpa());

    }
}
