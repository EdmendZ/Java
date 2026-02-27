package com.zls.list.exercise;

public class Student {

    private String name;

    private String sex;

    private int age;

    private double score;

    public Student(String name, String sex, int age, double score) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return name + "," + sex + "," + age + "," + score ;
    }
}
