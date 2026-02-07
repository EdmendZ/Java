package com.zls.inner;

import java.util.Arrays;

public class StudentManager {

    private Student[] stus = {};

    public void addStudent(Student stu) {
        stus = Arrays.copyOf(stus, stus.length + 1);
        stus[stus.length - 1] = stu;
    }

    static class StudentSorter {

        private int order; //0 descending 1 ascending

        public StudentSorter() {
            this(0);
        }

        public StudentSorter(int order) {
            this.order = order;
        }

        public void sort(Student[] stus) {
            for(int i = 0; i < stus.length; i++) {
                for(int j = 0; j < stus.length - i - 1; j++) {
                    int age1 = stus[j].getAge();
                    int age2 = stus[j+1].getAge();
                    if((order == 0) && age1 < age2 || (order == 1 && age1 > age2)) {
                        Student temp = stus[j];
                        stus[j] = stus[j+1];
                        stus[j+1] = temp;
                    }
                }
            }
        }
    }
    public void showStudent(StudentSorter sorter) {
        sorter.sort(stus);
        for(Student stu: stus) {
            System.out.println(stu);
        }
    }
}
