package com.myf.datastructure.linked;

/**
 * @Author : myf
 * @Date : 2020/10/24 9:57
 * @Description : 双端链表
 * @Version : 1.0
 */
public class FirstLastLinkedList {

    /**
     * 头结点
     */
    private Node first;

    /**
     * 尾结点
     */
    private Node last;

    public FirstLastLinkedList() {
        first = null;
        last = null;
    }

    /**
     * 插入一个结点，在头结点进行插入
     */
    public void insertFirst(long value) {
        Node node = new Node(value);
        if (isEmpty()) {
            last = node;
        }
        node.next = first;
        first = node;
    }

    /**
     * 插入一个结点，从尾结点进行插入
     */
    public void insertLast(long value) {
        Node node = new Node(value);
        if (isEmpty()) {
            first = node;
        } else {
            node.next = node;
        }
        last = node;

    }

    /**
     * 删除一个结点，在头结点进行删除
     */
    public Node delectFirst() {
        Node temp = first;
        if (first.next==null){
            last = null;
        }
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
    public Node delete(long value) {

        Node current = first;
        Node previous = first;
        while (current.data != value) {
            if (current.next == null) {
                return null;
            }
            previous = current;
            current = current.next;
        }
        if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
        return current;
    }

    /**
     * 判断是否为空
     */
    public boolean isEmpty() {
        return first == null;
    }
}
