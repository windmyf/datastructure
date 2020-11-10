package com.myf.datastructure.queue;

/**
 * @author windmyf
 * @date 2020/10/22 17:03
 * @desc 队列
 */
public class MyQueue {
    /**
     * 底层使用数组
     */
    private long[] arr;
    /**
     * 有效数据大小
     */
    private int elements;
    /**
     * 队头
     */
    private int front;
    /**
     * 队尾
     */
    private int end;

    /**
     * 默认构造方法
     */
    public MyQueue() {
        arr = new long[10];
        elements = 0;
        front = 0;
        end = -1;
    }

    /**
     * 带参构造方法
     */
    public MyQueue(int maxsize) {
        arr = new long[maxsize];
        elements = 0;
        front = 0;
        end = -1;
    }

    /**
     * 添加数据，从队尾插入
     */
    public void insert(long value) {
        arr[++end] = value;
        elements++;
    }

    /**
     * 删除数据，从队头删除
     */
    public long remove() {
        elements--;
        return arr[front++];
    }

    /**
     * 查看数据，从队头查看
     */
    public long peek() {
        return arr[front];
    }

    /**
     * 判断是否为空
     */
    public boolean isEmpty() {
        return elements == 0;
    }

    /**
     * 判断队列是否已满
     */
    public boolean isFull(){
        return elements == arr.length;
    }
}
