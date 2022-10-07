package com._4stack;

public class MyStack {
    private int[] data;//定义成员变量（通过属性）
    private int top;//在调用的时候不可见
    //创建一个栈
    public MyStack(int maxSize){// 构造函数，名称和类名一致
        data=new int[maxSize];//定义data是一个长度为maxsize的数组
        top= -1;//指针的初始化位置
    }

    //进栈
    public boolean push(int value){
        if(isFull()){//在同一个类下面引用可以直接引用方法，不用加类名
            return false;
        }
        top++;
        data[top]=value;
        return true;
    }

    //出栈
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int res=data[top];//如果直接在这里return，下面的代码就无法执行了
        top--;
        return res;
    }

    //判断栈是否为空
    public boolean isEmpty(){
        return top == -1;//==表示判断两边是否相等，是一个判断句式
        /*if(top == -1){
            return true;
        }else {
            return false;
        }*/
    }

    //判断栈是否满了
    public boolean isFull(){
        return top == data.length-1;//length是一个属性，位置top是从0开始的
    }

    //读取栈顶元素
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        int res=data[top];
        return res;
    }
}
