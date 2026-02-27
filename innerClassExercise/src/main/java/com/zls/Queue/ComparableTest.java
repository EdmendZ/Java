package com.zls.Queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableTest {

    public static void main(String[] args) {
        Student[] students = {
                new Student("student1", 25),
                new Student("student2", 25),
                new Student("student3", 25),
                new Student("student4", 25)
        };
        Arrays.sort(students);
        for(Student s: students){
            System.out.println(s);
        }
        System.out.println("======================");
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("student1", 26));
        studentList.add(new Student("student2", 27));
        studentList.add(new Student("student3", 28));
        studentList.add(new Student("student4", 29));
        // sort collection
        Collections.sort(studentList);
        for (Student s: studentList){
            System.out.println(s);
        }
        System.out.println("========================");
        String[] strings = {"d", "b", "a", "c"};
        Arrays.sort(strings);
        for(String str:strings){
            System.out.println(str);
        }

    }
}
