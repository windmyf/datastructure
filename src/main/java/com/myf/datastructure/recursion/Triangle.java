package com.myf.datastructure.recursion;

/**
 * @Author : myf
 * @Date : 2020/11/6 15:52
 * @Description : 三角形
 * @Version : 1.0
 */
public class Triangle {
    public int getNumber(int n) {
        int total = 0;
        while (n > 0) {
            total = total + n;
            n--;
        }
        return total;
    }

    public static int getNumberByRecursion(int n){
        if (n==1){
            return 1;
        }else {
            return n+getNumberByRecursion(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(getNumberByRecursion(10));
    }
}
