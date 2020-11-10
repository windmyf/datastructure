package com.myf.datastructure.sort;

/**
 * @author windmyf
 * @date 2020/10/22 16:27
 * @desc 插入排序
 */
public class InsertSort {
    public static void sort(long[] arr) {
        long temp = 0;

        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            int j = i;
            while (j > 0 && arr[j] >= temp) {
                // 右移
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }
}
