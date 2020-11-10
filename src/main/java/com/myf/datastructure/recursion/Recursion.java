package com.myf.datastructure.recursion;
/**
 * @Author : myf
 * @Date : 2020/11/6 15:39
 * @Description : 递归
 * @Version : 1.0
 */
public class Recursion {
    public static void main(String[] args) {
        test2(100);
    }

    public static void test(){
        System.out.println("hello,you are beautiful!");
        test();
    }

    public static void test2(int n){
        System.out.println(n);
        if (n==0){
            return;
        }
        test2(n-1);
    }
}
