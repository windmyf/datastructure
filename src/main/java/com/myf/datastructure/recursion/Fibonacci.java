package com.myf.datastructure.recursion;
/** 
 * @Author : myf
 * @Date : 2020/11/6 16:00
 * @Description : 斐波那契数列
 * @Version : 1.0
 */
public class Fibonacci {

    public  static int getNumber(int n){
        if (n == 1){
            return 0;
        }else if (n == 2){
            return 1;
        }else {
            return getNumber(n-1) + getNumber(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(getNumber(5));
    }
}
