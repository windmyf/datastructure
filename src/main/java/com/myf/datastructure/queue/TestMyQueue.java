package com.myf.datastructure.queue;
/**
 * @author windmyf
 * @date 2020/10/22 17:11
 * @desc 队列测试
 */
public class TestMyQueue {
    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue(4);
        myQueue.insert(34);
        myQueue.insert(23);
        myQueue.insert(52);
        myQueue.insert(10);

        System.out.println("myQueue.isEmpty() = " + myQueue.isEmpty());
        System.out.println("myQueue.isFull() = " + myQueue.isFull());

        System.out.println("myQueue.peek() = " + myQueue.peek());
        System.out.println("myQueue.peek() = " + myQueue.peek());
        
        while (!myQueue.isEmpty()){
            System.out.println(myQueue.remove() + "");
        }

        System.out.println("myQueue.isEmpty() = " + myQueue.isEmpty());
    }
}
