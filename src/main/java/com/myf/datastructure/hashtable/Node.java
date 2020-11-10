package com.myf.datastructure.hashtable;

import lombok.Data;

/**
 * @Author : myf
 * @Date : 2020/10/24 9:53
 * @Description : 链节点，相当于车厢
 * @Version : 1.0
 */
@Data
public class Node {
    /**
     * 数据域
     */
    public Info info;
    /**
     * 指针域
     */
    public Node next;

    public Node(Info info){
        this.info = info;
    }

    /**
     * 显示方法
     */
    public void display(){
        System.out.print(info+" ");
    }

}
