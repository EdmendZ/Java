package com.zls.list;

import java.util.ArrayList;

public class MyStack<T> extends ArrayList {

    public void push(T t){
        add(t);
    }

    public T pop(){
        if(size() == 0)
            throw new IllegalArgumentException("Stack里无数据");
        T t = (T) get(size() - 1);
        remove(t);
        return t;
    }
}
