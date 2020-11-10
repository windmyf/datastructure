package com.myf.datastructure.tree;

import lombok.Data;

/**
 * @Author : myf
 * @Date : 2020/11/9 15:22
 * @Description : 二叉树的节点
 * @Version : 1.0
 */
@Data
public class Node {

    // 数据项
    private long data;

    // 数据项
    private String sData;

    // 左子节点
    private Node leftChild;

    // 右子节点
    private Node rightChild;

    public Node(long data,String sData){
        this.data = data;
        this.sData = sData;
    }

}
