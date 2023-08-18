package com.learn.functionalInterfaces;

import java.util.List;

public class Student {
    private String name;
    private int grade_Level;
    private double gpa;
    private String gender;

    public Student(String name, int grade_Level, double gpa, String gender, int notebooks, List<String> activities) {
        this.name = name;
        this.grade_Level = grade_Level;
        this.gpa = gpa;
        this.gender = gender;
        this.notebooks = notebooks;
        this.activities = activities;
    }

    private int notebooks;

    public int getNotebooks() {
        return notebooks;
    }

    public void setNotebooks(int notebooks) {
        this.notebooks = notebooks;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    private List<String> activities ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade_Level() {
        return grade_Level;
    }

    public void setGrade_Level(int grade_Level) {
        this.grade_Level = grade_Level;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade_Level=" + grade_Level +
                ", gpa=" + gpa +
                ", gender='" + gender + '\'' +
                '}';
    }
}
