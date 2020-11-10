package com.myf.datastructure.sort;
/**
 * @author windmyf
 * @date 2020/10/22 16:07
 * @desc 排序测试
 */
public class TestInsertSort {

    public static void main(String[] args) {
        long[] arr = new long[5];
        arr[0] = 43;
        arr[1] = 34;
        arr[2] = 20;
        arr[3] = 4;

        System.out.print("[");
        for (long num : arr){
            System.out.print( num + " ");
        }
        System.out.print("]");
        System.out.println();

        InsertSort.sort(arr);

        System.out.print("[");
        for (long num : arr){
            System.out.print( num + " ");
        }
        System.out.print("]");
        System.out.println();

    }
}
