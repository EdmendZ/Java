package com.zls.Queue;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueTest {
    public static void main(String[] args) {

        // 构建队列时 我们通常会给队列设置一个容量 因为默认容量太大
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>(5);
        // String first = queue.element(); // 获取队列中的第一个元素(不会移除)，如果队列为空，则抛出异常
        // System.out.println(first);
        String first = queue.peek(); // 获取队列中的第一个元素，如果为空，则返回null
        System.out.println(first);
        queue.add("a"); // 向队列中添加一个元素，如果出现异常，则直接抛出异常
        queue.add("b");
        queue.add("c");
        queue.add("d");
        queue.add("e");
        // queue.add("f"); 放入第六个元素将抛出异常
        boolean success = queue.offer("f"); // 向队列中添加一个元素，如果出现异常，则返回false
        System.out.println(success);

        queue.remove(); //移除队列中第一个元素，如果队列中没有元素，则将抛出异常
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        System.out.println("=========================");
        // queue.remove(); // 移除第六个元素将抛出异常
        while(!queue.isEmpty()){
            String s = queue.poll(); //移除队列中第一个元素，如果队列中没有元素，则返回null
            System.out.println(s);
        }
        String s = queue.poll();
        System.out.println(s);
    }
}
