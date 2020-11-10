package com.myf.datastructure.array;

/**
 * @author windmyf
 * @date 2020/10/22 15:12
 * @desc 数组类
 */
public class MyArray {

    private long[] arr;

    /**
     * 标识有效数据的长度
     **/
    private int elements;

    public MyArray() {
        arr = new long[50];
    }

    public MyArray(int maxsize) {
        arr = new long[maxsize];
    }

    /**
     * 添加数据
     */
    public void insert(long value) {
        arr[elements] = value;
        elements++;
    }

    /**
     * 显示数据
     */
    public void display() {
        System.out.print("[");
        for (int i = 0; i < elements; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }

    /**
     * 查找数据(根据值查找)
     */
    public int search(long value) {
        int i;
        for (i = 0; i < elements; i++) {
            if (value == arr[i]) {
                break;
            }
        }
        if (i == elements) {
            return -1;
        } else {
            return i;
        }
    }

    /**
     * 查找数据（根据索引来查）
     */
    public long get(int index) {
        if (index >= elements || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            return arr[index];
        }
    }

    /**
     * 删除数据
     */
    public void delete(int index) {
        if (index >= elements || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            for (int i = index; i < elements; i++) {
                arr[index] = arr[index + 1];
            }
            elements--;
        }
    }

    /**
     * 更新数据
     */
    public void change(int index,int newValue){
        if (index>= elements|| index<0){
            throw new ArrayIndexOutOfBoundsException();
        }else {
            arr[index] = newValue;
        }
    }
}
