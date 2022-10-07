package com._5Queue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue myQueue=new MyQueue();
        myQueue.enQueue(8);

        boolean res=myQueue.isEmpty();
        System.out.println(res);

        int res2=myQueue.deQueue();
        System.out.println(res2);

        boolean res3=myQueue.isEmpty();
        System.out.println(res3);
    }
}
