package com.myf.datastructure.linked;
/**
 * @Author : myf
 * @Date : 2020/10/24 10:09
 * @Description : 链表测试
 * @Version : 1.0
 */
public class TestLinked {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(15);
        linkedList.insertFirst(43);
        linkedList.insertFirst(78);
        linkedList.insertFirst(1);
        linkedList.insertFirst(67);

        linkedList.display();

        linkedList.delectFirst();
        linkedList.display();

        Node node = linkedList.find(78);
        node.display();

        Node delete = linkedList.delete(43);
        System.out.println("delete = " + delete);
        linkedList.display();

    }
}
