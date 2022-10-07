package com._5Queue;

import java.util.Stack;

public class MyQueue {

    private ListNode front;
    private ListNode rear;

    //创建一个链式队列，并初始化
    public MyQueue(){
        front=new ListNode(0);
        rear=front;
    }

    //进队
    public void enQueue(int value){
        ListNode node=new ListNode(value);
        rear.next=node;
        rear=rear.next;//rear往后移一步
    }

    //出队
    public int deQueue(){
        if(isEmpty()){
            return -1;
        }
        ListNode p=front.next;//复制第一个节点
        front.next=front.next.next;//头节点直接指向下一个节点
        p.next=null;//释放第一个节点的指针
        if(rear==p){
            rear=front;//如果删除的是最后一个节点，要把rear指向front
        }
        return p.value;
    }

    //判空
    public boolean isEmpty(){
        return front==rear;
    }

}
