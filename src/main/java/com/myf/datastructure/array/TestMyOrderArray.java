package com.myf.datastructure.array;
/**
 * @author windmyf
 * @date 2020/10/22 15:39
 * @desc 有序数组测试
 */
public class TestMyOrderArray {
    public static void main(String[] args) {
        MyOrderArray myOrderArray = new MyOrderArray();
        myOrderArray.insert(53);
        myOrderArray.insert(22);
        myOrderArray.insert(65);
        myOrderArray.insert(10);
        myOrderArray.insert(40);
        myOrderArray.insert(98);

        myOrderArray.display();

        System.out.println("myOrderArray.binarySearch(40) = " + myOrderArray.binarySearch(40));
    }
}
