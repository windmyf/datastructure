package com.myf.datastructure.graph;

import com.myf.datastructure.stack.MyStack;
import lombok.Data;

/**
 * @author : wind-myf
 * @version : 1.0
 * @date : 2020/11/10 12:15
 * @desc : 图
 */
@Data
public class Graph1 {
    // 顶点数组
    private Vertex1[] vertexList;
    // 邻接矩阵
    private int[][] adjMat;
    // 顶点的最大数目
    private int maxSize = 20;
    // 当前顶点
    private int nVertex;
    // 栈
    private MyStack stack;

    public Graph1() {
        vertexList = new Vertex1[maxSize];
        adjMat = new int[maxSize][maxSize];
        for (int i = 0; i < maxSize; i++) {
            for (int j = 0; j < maxSize; j++) {
                adjMat[i][j] = 0;
            }
        }
        nVertex = 0;
        stack = new MyStack();
    }

    /**
     * 添加顶点
     *
     * @param label 顶点
     */
    public void addVertex(char label) {
        vertexList[nVertex++] = new Vertex1(label);
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    /**
     * 查找当前节点未访问过的节点
     *
     * @param v 当前节点
     * @return
     */
    public int getAdjUnvisitedVertex(int v) {
        for (int i = 0; i < nVertex; i++) {
            if (adjMat[v][i] == 1 && !vertexList[i].wasVisited) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 深度优先搜索
     */
    public void dfs() {
        // 首先访问0号顶点
        vertexList[0].wasVisited = true;
        // 显示该顶点
        displayVertex(0);
        // 压入栈中
        stack.push(0);
        while (!stack.isEmpty()) {
            // 获得一个未访问的邻接点
            int v = getAdjUnvisitedVertex((int) stack.peek());
            if (v == -1) {
                // 弹出该顶点
                stack.pop();
            } else {
                vertexList[v].wasVisited = true;
                displayVertex(v);
                stack.push(v);
            }
        }
        // 搜索完成后，要将访问信息修改
        for (int i = 0; i < nVertex; i++) {
            vertexList[i].wasVisited = false;
        }
    }

    /**
     * 节点展示
     * @param v 当前节点
     */
    public void displayVertex(int v) {
        System.out.print(vertexList[v].getLabel());
    }

    public void mst(){
        // 首先访问0号顶点
        vertexList[0].wasVisited = true;
        // 显示该顶点
        displayVertex(0);
        System.out.println();
        // 压入栈中
        stack.push(0);
        while (!stack.isEmpty()) {
            // 获得一个未访问的邻接点
            int currentVertex = (int)stack.peek();
            int v = getAdjUnvisitedVertex(currentVertex);
            if (v == -1) {
                // 弹出该顶点
                stack.pop();
            } else {
                vertexList[v].wasVisited = true;
                stack.push(v);
                displayVertex(currentVertex);
                System.out.print("-");
                displayVertex(v);
                System.out.println(" ");
            }
        }
        // 搜索完成后，要将访问信息修改
        for (int i = 0; i < nVertex; i++) {
            vertexList[i].wasVisited = false;
        }
    }

    /**
     * 测试方法
     *
     * @param args
     */
    public static void main(String[] args) {
        Graph1 graph = new Graph1();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);

        graph.dfs();
        System.out.println();
        System.out.println();
        graph.mst();
    }
}
