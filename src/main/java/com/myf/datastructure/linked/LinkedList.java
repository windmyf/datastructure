package com.myf.datastructure.linked;

/**
 * @Author : myf
 * @Date : 2020/10/24 9:57
 * @Description : 链表，相当于火车
 * @Version : 1.0
 */
public class LinkedList {

    /**
     * 头结点
     */
    private Node first;

    public LinkedList() {
        first = null;
    }

    /**
     * 插入一个结点，在头结点进行插入
     */
    public void insertFirst(long value) {
        Node node = new Node(value);
        node.next = first;
        first = node;
    }

    /**
     * 删除一个结点，在头结点进行删除
     */
    public Node delectFirst() {
        Node temp = first;
        first = temp.next;
        return temp;
    }

    /**
     * 显示结点中的数据
     */
    public void display() {
        Node current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }

    /**
     * 查找
     */
    public Node find(long value) {
        Node current = first;
        while (current.data != value) {
            if (current.next == null) {
                return null;
            }
            current = current.next;
        }
        return current;
    }

    /**
     * 删除，根据数据域进行删除
     */
    public Node delete(long value){
        Node current = first;
        Node previous = first;
        while (current.data!=value){
            if (current.next == null){
                return null;
            }
            previous = current;
            current = current.next;
        }
        if (current == first){
           first = first.next;
        }else {
            previous.next = current.next;
        }
        return current;
    }
}
