package com._4stack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack myStack=new MyStack(10);
        myStack.push(1);
        int res=myStack.peek();
        System.out.println(res);

        int res2=myStack.pop();
        System.out.println(res2);

        boolean res3=myStack.isEmpty();
        System.out.println(res3);

        boolean res4=myStack.isFull();
        System.out.println(res4);

    }
}
