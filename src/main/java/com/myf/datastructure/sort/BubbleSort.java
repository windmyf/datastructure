package com.myf.datastructure.sort;
/**
 * @author windmyf
 * @date 2020/10/22 16:02
 * @desc 冒泡排序
 */
public class BubbleSort {

    public static void sort(long[] arr){
        long temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1;j>i;j--){
                if (arr[j]<arr[j-1]){
                    // 进行交换
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
