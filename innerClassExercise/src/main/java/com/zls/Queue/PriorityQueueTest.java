package com.zls.Queue;

import java.util.PriorityQueue;

public class PriorityQueueTest {

    public static void main(String[] args) {
        // PriorityQueue 是一个有排序规则的队列，存入进去的元素是无序的，队列有长度，超出长度范围的 元素将无法存储进队列。需要注意的是，如果存储的元素如果不能进行比较排序，也未提供任何对元素 进行排序的方式，运行时会抛出异常
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.offer(1);
        queue.offer(4);
        queue.offer(3);
        queue.offer(5);
        queue.offer(2);
        for (Integer number: queue){
            System.out.println(number);
        }
        System.out.println("=====================");
        while(!queue.isEmpty()){
            Integer number = queue.poll(); // E poll(); 移除队列中第一个元素，如果队列中没有元素，则返回null
            System.out.println(number);
        }

        // 如果PriorityQueue队列中存储的是对象，怎么排序
        PriorityQueue<User> userQueue = new PriorityQueue<>();
        userQueue.offer(new User("张三", 0));
        userQueue.offer(new User("李四", 0));
        userQueue.offer(new User("金凤", 0));
        userQueue.offer(new User("龙华", 0));
    }
}
