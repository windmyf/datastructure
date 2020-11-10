package com.myf.datastructure.hashtable;

import java.math.BigInteger;
/**
 * @Author : myf
 * @Date : 2020/11/10 11:12
 * @Description : 哈希表---开放地址法
 * @Version : 1.0
 */
public class HashTable {

    private Info[] arr;

    public HashTable() {
        arr = new Info[100];
    }

    /**
     * 指定数组初始化大小
     *
     * @param maxSize 数组大小
     */
    public HashTable(int maxSize) {
        arr = new Info[maxSize];
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
        while (arr[hashVal] != null && arr[hashVal].getName() != null) {
            // 递加
            ++hashVal;
            // 循环
            hashVal %= arr.length;
        }
        arr[hashVal] = info;
    }

    /**
     * 查找数据
     *
     * @param key
     * @return
     */
    public Info find(String key) {
        int hashVal = hashCode(key);
        while (arr[hashVal] != null){
            if (arr[hashVal].getKey().equals(key)){
                return arr[hashVal];
            }
            ++ hashVal;
            hashVal %=arr.length;
        }
        return null;
    }

    public Info delete(String key){
        int hashVal = hashCode(key);
        while (arr[hashVal]!=null){
            if (arr[hashVal].getKey().equals(key)){
                Info temp = arr[hashVal];
                temp.setName(null);
                return temp;
            }
            ++ hashVal;
            hashVal %= arr.length;
        }
        return null;
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
        HashTable hashTable = new HashTable();
        hashTable.insert(new Info("a", "张三"));
        hashTable.insert(new Info("ct", "李四"));
        hashTable.insert(new Info("b", "王五"));
        hashTable.insert(new Info("cba", "赵丽"));

        System.out.println(hashTable.find("a"));
        System.out.println(hashTable.find("ct"));
        System.out.println(hashTable.find("b"));
        System.out.println(hashTable.delete("b"));
        System.out.println(hashTable.find("b"));
    }

}
