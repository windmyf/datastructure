package com.myf.datastructure.sort;

/**
 * @Author : myf
 * @Date : 2020/11/9 14:14
 * @Description : 快速排序
 * @Version : 1.0
 */
public class QuickSort {
    /**
     * 划分数组
     *
     * @param arr 数组
     * @param left 左侧
     * @param right 右侧
     * @param point 关键字
     */
    public static int partition(long arr[], int left, int right, long point) {

        int leftPtr = left - 1;
        int rightPtr = right;
        while (true) {
            // 循环,比关键字小的留在左端
            while (leftPtr < rightPtr && arr[++leftPtr] < point) ;
            // 循环，比关键字大的留在右端
            while (rightPtr > leftPtr && arr[--rightPtr] > point) ;

            if (leftPtr >= rightPtr) {
                break;
            } else {
                long temp = arr[leftPtr];
                arr[leftPtr] = arr[rightPtr];
                arr[rightPtr] = temp;
            }

        }

        // 将关键字与当前所指的进行交换
        long temp = arr[leftPtr];
        arr[leftPtr] = arr[right];
        arr[right] = temp;

        return leftPtr;
    }

    /**
     * 打印数组
     * @param arr 数组
     */
    public static void display(long[] arr) {
        System.out.print("[");
        for (long num : arr) {
            System.out.print(num + " ");
        }
        System.out.print("]");
        System.out.println();
    }

    /**
     * 排序
     * @param arr 数组
     * @param left 左侧
     * @param right 右侧
     */
    public static void sort(long arr[],int left,int right){
        if (right-left<=0){
            return;
        }else {
            // 设置关键字
            long point = arr[right];
            // 获得切入点，同事进行数组划分
            int partition = partition(arr,left,right, point);
            // 对左边的子数组进行快速排序
            sort(arr,left,partition-1);
            sort(arr,partition+1,right);
        }

    }

    public static void main(String[] args) {
        long arr[] = new long[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (long) (Math.random() * 99);
        }

        display(arr);

        sort(arr,0,arr.length-1);
        display(arr);
    }
}
