package com.myf.datastructure.hashtable;

import java.math.BigInteger;

/**
 * @Author : myf
 * @Date : 2020/11/10 11:12
 * @Description : 哈希表---链地址法
 * @Version : 1.0
 */
public class HashTable1 {

    private LinkedList[] arr;

    public HashTable1() {
        arr = new LinkedList[100];
    }

    /**
     * 指定数组初始化大小
     *
     * @param maxSize 数组大小
     */
    public HashTable1(int maxSize) {
        arr = new LinkedList[maxSize];
    }

    /**
     * 插入数据
     *
     * @param info 员工信息
     */
    public void insert(Info info) {

        // 获得关键字
        String key = info.getKey();
        // 关键字所自定的hash数
        int hashVal = hashCode(key);
        // 如果这个索引已经被占用，并且是一个未被删除的数据
        if (arr[hashVal] == null) {
           arr[hashVal] = new LinkedList();
        }
        arr[hashVal].insertFirst(info);
    }

    /**
     * 查找数据
     *
     * @param key
     * @return
     */
    public Info find(String key) {
        int hashVal = hashCode(key);
        return arr[hashVal].find(key).info;

    }

    public Info delete(String key){
        int hashVal = hashCode(key);
        return arr[hashVal].delete(key).info;
    }

    public int hashCode(String key) {
//        int hashVal = 0;
//        for (int i = key.length()-1; i >=0; i--) {
//            int letter = key.charAt(i) - 96;
//            hashVal += letter;
//        }
        BigInteger hashVal = new BigInteger("0");
        BigInteger pow27 = new BigInteger("1");
        for (int i = key.length() - 1; i >= 0; i--) {
            int letter = key.charAt(i) - 96;
            BigInteger letterB = new BigInteger(String.valueOf(letter));
            hashVal = hashVal.add(letterB.multiply(pow27));
            pow27 = pow27.multiply(new BigInteger(String.valueOf(27)));
        }
        return hashVal.mod(new BigInteger(String.valueOf(arr.length))).intValue();
    }

    public static void main(String[] args) {
        HashTable1 hashTable = new HashTable1();
        hashTable.insert(new Info("a", "张三"));
        hashTable.insert(new Info("ct", "李四"));
        hashTable.insert(new Info("b", "王五"));
        hashTable.insert(new Info("bt", "赵丽"));

        System.out.println(hashTable.find("a"));
        System.out.println(hashTable.find("ct"));
        System.out.println(hashTable.find("b"));
//        System.out.println(hashTable.delete("b"));
        System.out.println(hashTable.find("bt"));
        System.out.println("a = " + hashTable.hashCode("a"));
        System.out.println("ct = " + hashTable.hashCode("ct"));

        System.out.println(hashTable.delete("b"));
        System.out.println(hashTable.find("b"));
    }

}
