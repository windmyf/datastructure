package com.myf.datastructure.stack;
/**
 * @author windmyf
 * @date 2020/10/22 16:50
 * @desc 栈
 */
public class MyStack {
    /**
     * 底层实现是一个数组
     */
    private long[] arr;
    /**
     * 栈顶
     */
    private int top;

    /**
     * 默认的构造方法
     */
    public MyStack(){
        arr = new long[10];
        top = -1;
    }

    /**
     * 带参数的构造方法，参数的数组初始化大小
     */
    public MyStack(int maxsize){
        arr = new long[maxsize];
        top = -1;
    }

    /**
     * 添加数据
     */
    public void push(int value){
        arr[++top] = value;
    }

    /**
     * 移除数据（弹出数据）
     */
    public long pop(){
        return arr[top--];
    }

    /**
     * 查看数据
     */
    public long peek(){
        return arr[top];
    }

    /**
     * 判断是否为空
     */
    public boolean isEmpty(){
        return top == -1;
    }

    /**
     * 判断是否满了
     */
    public boolean isFull(){
        return top == arr.length - 1;
    }
}
