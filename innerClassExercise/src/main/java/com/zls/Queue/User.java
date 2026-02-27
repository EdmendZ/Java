package com.zls.Queue;

public class User implements Comparable<User> {

    private String name;

    private int level;

    public User(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public int compareTo(User o) {
        if (level == o.level) return 0;
        else if(level < o.level) return -1;
        else return 1;
    }
}
