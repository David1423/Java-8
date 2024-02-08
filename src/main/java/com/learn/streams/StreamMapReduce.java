package com.learn.streams;

import com.learn.functionalInterfaces.StudentDAO;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMapReduce {

    public static List<String> getStudentAndNotebooks(){
        return StudentDAO.getAllStudents()
                .stream()
                .map(student -> student.getName()+": "+student.getNotebooks())
                .collect(Collectors.toList());
    }

    public static int noOfNoteBooks(){

        return StudentDAO.getAllStudents().stream()
                .map(student -> student.getNotebooks())
                //.reduce(0,(a,b)->a+b);// Integer class has the sum method,so we can simply write the code as below.
                .reduce(0,Integer::sum);//Integer class doesn't have mul method, you can use above style coding for that.
    }

    public static int noOfBooksWithFilter(){
        /*return StudentDAO.getAllStudents().stream()
                .map(student -> student.getNotebooks())
                .filter()
                .reduce();*/
    return 0;
    }
    public static void main(String[] args) {

        List<String> StudentsNoteBooks = getStudentAndNotebooks();
        for(String s : StudentsNoteBooks){
            System.out.println(s);
        }//for

        System.out.println("All note Books of students: "+ noOfNoteBooks());
    }
}