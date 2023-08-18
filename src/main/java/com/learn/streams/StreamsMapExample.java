package com.learn.streams;

import com.learn.functionalInterfaces.Student;
import com.learn.functionalInterfaces.StudentDAO;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapExample {
    public static void main(String[] args) {

        List<String> students = StudentDAO.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
