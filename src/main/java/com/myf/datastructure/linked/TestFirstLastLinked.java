package com.myf.datastructure.linked;
/**
 * @Author : myf
 * @Date : 2020/10/24 10:09
 * @Description : 双端链表测试
 * @Version : 1.0
 */
public class TestFirstLastLinked {
    public static void main(String[] args) {
        FirstLastLinkedList linkedList = new FirstLastLinkedList();
//        linkedList.insertFirst(15);
//        linkedList.insertFirst(43);
//        linkedList.insertFirst(68);
//        linkedList.insertFirst(2);
//        linkedList.insertFirst(67);

        linkedList.insertLast(15);
        linkedList.insertLast(43);
        linkedList.insertLast(68);
        linkedList.insertLast(2);
        linkedList.insertLast(67);

        linkedList.display();
        System.out.println();

        linkedList.delectFirst();
        linkedList.display();

        System.out.println();
        linkedList.delectFirst();
        linkedList.display();

//        Node node = linkedList.find(78);
//        node.display();
//
//        Node delete = linkedList.delete(43);
//        System.out.println("delete = " + delete);
//        linkedList.display();

    }
}
