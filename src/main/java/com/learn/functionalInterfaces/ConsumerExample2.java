package com.learn.functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {

    static Consumer<Student> c1 = (student) -> System.out.println(student);
    static Consumer<Student> c2 = (student) -> System.out.println(student.getName());
    static Consumer<Student> c3 = (student) -> System.out.println(student.getActivities());
    static List<Student> studentList = StudentDAO.getAllStudents();

    public static void printStudentNameAndActivities(){

        //andThen() is a default method in FI Consumer
        System.out.println("printStudentNameAndActivities");
        studentList.forEach(c2.andThen(c3)); // consumer chaining.
    }

    public static void printStudentNameAndActivitiesWithACondition(){

        System.out.println("printStudentNameAndActivitiesWithACondition");
        studentList.forEach(
                student -> {
                    if(student.getGrade_Level()>=3)
                        c2.andThen(c3).accept(student); //accept() takes the result (composed comparator)
                }
        );
    }
    public static void main(String[] args) {

      ConsumerExample2.printStudentNameAndActivities();
      ConsumerExample2.printStudentNameAndActivitiesWithACondition();
    }
}
