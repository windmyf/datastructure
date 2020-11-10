package com.myf.datastructure.sort;

/**
 * @author windmyf
 * @date 2020/10/22 16:16
 * @desc 选择排序
 */
public class SelectionSort {
    public static void sort(long[] arr) {
        long temp = 0;
        int k = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            k = i;
            // 找到最小的放到i的位置
            for (int j = i;j<arr.length;j++){
                if (arr[j]<arr[k]){
                    k = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
        }
    }
}
