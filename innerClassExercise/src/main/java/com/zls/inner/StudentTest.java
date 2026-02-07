package com.zls.inner;

public class StudentTest {

    public static void main(String[] args) {
        StudentManager manger = new StudentManager();
        manger.addStudent(new Student("student1",20));
        manger.addStudent(new Student("student2",21));
        manger.addStudent(new Student("student3",22));
        manger.addStudent(new Student("student4",23));

        manger.showStudent(new StudentManager.StudentSorter(0));
    }
}
