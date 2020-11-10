package com.myf.datastructure.stack;
/**
 * @author windmyf
 * @date 2020/10/22 16:59
 * @desc 栈测试
 */
public class TestMyStack {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(4);
        myStack.push(23);
        myStack.push(12);
        myStack.push(1);
        myStack.push(45);

        System.out.println("myStack.isEmpty() = " + myStack.isEmpty());
        System.out.println("myStack.isFull() = " + myStack.isFull());

        System.out.println("myStack.peek() = " + myStack.peek());

        while (!myStack.isEmpty()){
            System.out.println(myStack.pop() + " ");
        }
    }
}
