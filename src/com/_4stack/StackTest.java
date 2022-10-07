package com._4stack;

import java.util.Stack;

public class StackTest {
    Stack<Integer> stack=new Stack<>();//构造函数：通过类来构造对象
    //进栈
    public void inStack(int value){
        stack.push(value);
    }

    //出栈
    public int outStack(){
        int out= stack.pop();
        return out;
    }

    //判断栈是否为空
    public boolean isEmpty(){
       boolean res= stack.isEmpty();
       return res;
    }

    //读取栈顶元素
    public int getTopValue(){
        int top=stack.peek();
        return top;
    }
}
