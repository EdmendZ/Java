package com.zls.list;

public class DeNode <T> {

    private T data; // 链表中存储的元素

    private DeNode<T> prev; // 前一个链

    private DeNode<T> next; // 后一个链

    public DeNode(T data, DeNode<T> prev, DeNode<T> next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public DeNode<T> getPrev() {
        return prev;
    }

    public DeNode<T> getNext() {
        return next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setPrev(DeNode<T> prev) {
        this.prev = prev;
    }

    public void setNext(DeNode<T> next) {
        this.next = next;
    }
}
