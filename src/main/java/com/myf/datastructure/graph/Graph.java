package com.myf.datastructure.graph;

import lombok.Data;

/**
 * @author : wind-myf
 * @date : 2020/11/10 12:15
 * @desc : 图
 * @version : 1.0
 */
@Data
public class Graph {
    // 顶点数组
    private Vertex[] vertexList;
    // 邻接矩阵
    private int[][] adjMat;
    // 顶点的最大数目
    private int maxSize = 20;
    // 当前顶点
    private int nVertex;

    public Graph(){
        vertexList = new Vertex[maxSize];
        adjMat = new int[maxSize][maxSize];
        for (int i = 0; i < maxSize; i++) {
            for (int j = 0; j < maxSize; j++) {
                adjMat[i][j] = 0;
            }
        }
        nVertex = 0;
    }

    /**
     * 添加顶点
     * @param label 顶点
     */
    public void addVertex(char label){
        vertexList[nVertex++] = new Vertex(label);
    }

    public void addEdge(int start,int end){
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    /**
     * 测试方法
     * @param args
     */
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,2);
    }
}
