package com.myf.datastructure.array;

/**
 * @author windmyf
 * @date 2020/10/22 15:17
 * @desc 数组测试类
 */
public class TestMyArray {
    public static void main(String[] args) {
        MyArray array = new MyArray();
        array.insert(13);
        array.insert(24);
        array.insert(35);

        array.display();
        System.out.println("array.search(55) = " + array.search(55));

        System.out.println("array.get(1) = " + array.get(1));

        array.change(1,77);
        array.display();
    }
}
