package com.myf.datastructure.graph;

import lombok.Data;

/**
 * @author : wind-myf
 * @date : 2020/11/10 12:13
 * @desc : 顶点类
 * @version : 1.0
 */
@Data
public class Vertex {
    private char lable;

    public Vertex(char lable){
        this.lable = lable;
    }
}
