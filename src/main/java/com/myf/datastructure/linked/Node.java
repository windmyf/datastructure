package com.myf.datastructure.linked;
/**
 * @Author : myf
 * @Date : 2020/10/24 9:53
 * @Description : 链节点，相当于车厢
 * @Version : 1.0
 */
public class Node {
    /**
     * 数据域
     */
    public long data;
    /**
     * 指针域
     */
    public Node next;

    public Node(long value){
        this.data = value;
    }

    /**
     * 显示方法
     */
    public void display(){
        System.out.print(data+" ");
    }

}
