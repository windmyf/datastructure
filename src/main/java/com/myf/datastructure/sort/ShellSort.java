package com.myf.datastructure.sort;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @Author : myf
 * @Date : 2020/11/9 13:39
 * @Description : 希尔排序
 * @Version : 1.0
 */
public class ShellSort {
    /**
     * 排序方法
     *
     * @param arr
     */
    public static void sort(long[] arr) {
        // 初始化一个间隔
        int h = 1;
        // 计算最大间隔
        while (h < arr.length / 3) {
            h = 3 * h + 1;
        }

        while (h > 0) {
            // 进行插入排序
            long temp = 0;
            for (int i = h; i < arr.length; i++) {
                temp = arr[i];
                int j = i;
                while (j > h - 1 && arr[j - h] >= temp) {
                    arr[j] = arr[j - h];
                    j -= h;
                }
                arr[j] = temp;
            }
            // 减小间隔
            h=(h-1)/3;
        }
    }

    public static void main(String[] args) {
        long[] arr = new long[7];
        arr[0] = 19;
        arr[1] = 1;
        arr[2] = 54;
        arr[3] = -1;
        arr[4] = 73;
        arr[5] = 46;
        arr[6] = 32;

        for (int i= 0;i<arr.length;i++ ){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sort(arr);
        for (int i= 0;i<arr.length;i++ ){
            System.out.print(arr[i]+ " ");
        }
    }
}
