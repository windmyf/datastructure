package com.myf.datastructure.tree;

/**
 * @Author : myf
 * @Date : 2020/11/9 15:25
 * @Description : 二叉树
 * @Version : 1.0
 */
public class Tree {

    // 根节点
    private Node root;

    /**
     * 插入节点
     *
     * @param value
     */
    public void insert(long value, String sValue) {

        // 封装节点
        Node newNode = new Node(value, sValue);

        // 引用当前节点
        Node current = root;

        // 引用父节点
        Node parent;

        // 如果root为null，也就是第一次插入的时候
        if (root == null) {
            root = newNode;
            return;
        } else {
            while (true) {
                // 父节点指向当前节点
                parent = current;
                // 如果当前指向的节点数据比插入的要大，则 向左走
                if (current.getData() > value) {
                    current = current.getLeftChild();
                    if (current == null) {
                        parent.setLeftChild(newNode);
                        return;
                    }
                } else {
                    current = current.getRightChild();
                    if (current == null) {
                        parent.setRightChild(newNode);
                        return;
                    }
                }
            }

        }

    }

    /**
     * 查找节点
     *
     * @param value
     */
    public Node find(long value) {
        // 引用当前节点，从根节点开始
        Node current = root;

        // 循环，只要查找值不等于当前节点的数据项
        while (current.getData() != value) {
            // 进行比较，比较查找值和当前节点的大小
            if (current.getData() > value) {
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }
            if (current == null) {
                return null;
            }
        }
        return current;

    }

    /**
     * 前序遍历
     *
     * @param localNode 根节点
     */
    public void frontOrder(Node localNode) {
        if (localNode != null) {
            // 访问根节点
            System.out.println(localNode.getData() + ", " + localNode.getSData());
            // 前序遍历左子树
            frontOrder(localNode.getLeftChild());
            // 前序遍历右子树
            frontOrder(localNode.getRightChild());
        }
    }

    /**
     * 中序遍历
     *
     * @param localNode 根节点
     */
    public void middleOrder(Node localNode) {
        if (localNode != null) {
            // 中序遍历左子树
            middleOrder(localNode.getLeftChild());
            // 访问根节点
            System.out.println(localNode.getData() + ", " + localNode.getSData());
            // 前序遍历右子树
            middleOrder(localNode.getRightChild());
        }
    }

    /**
     * 后序遍历
     *
     * @param localNode 根节点
     */
    public void afterOrder(Node localNode) {
        if (localNode != null) {
            // 后序遍历左子树
            afterOrder(localNode.getLeftChild());
            // 后序遍历右子树
            afterOrder(localNode.getRightChild());
            // 访问根节点
            System.out.println(localNode.getData() + ", " + localNode.getSData());
        }
    }

    /**
     * 删除节点
     *
     * @param value
     */
    public boolean delete(long value) {

        // 引用当前节点，从根节点开始
        Node current = root;
        // 引用当前节点的父节点
        Node parent = root;
        // 是否为左节点
        boolean isLeftChild = true;

        while (current.getData() != value) {
            parent = current;
            if (current.getData() > value) {
                current = current.getLeftChild();
                isLeftChild = true;
            } else {
                current = current.getRightChild();
                isLeftChild = false;
            }

            // 如果查不到
            if (current == null) {
                return false;
            }
        }
        // 删除叶子结点，也就是该节点没有子节点
        if (current.getLeftChild() == null && current.getRightChild() == null) {
            if (current == root) {
                root = null;
            } else {
                // 如果它是父节点的左子节点
                if (isLeftChild) {
                    parent.setLeftChild(null);
                } else {
                    parent.setRightChild(null);
                }
            }

        } else if (current.getRightChild() == null) {
            if (current == root) {
                root = current.getLeftChild();
            } else {
                if (isLeftChild) {
                    parent.setLeftChild(current.getLeftChild());
                } else {
                    parent.setRightChild(current.getLeftChild());
                }
            }

        } else if (current.getLeftChild() == null) {
            if (current == root) {
                root = current.getRightChild();
            } else {
                if (isLeftChild) {
                    parent.setLeftChild(current.getRightChild());
                } else {
                    parent.setRightChild(current.getRightChild());
                }
            }
        }else {
            Node successor = getSuccessor(current);
            if (current == root){
                root = successor;
            }else if (isLeftChild){
                parent.setLeftChild(successor);
            }else {
                parent.setRightChild(successor);
            }
            successor.setLeftChild(current.getLeftChild());
        }

        return true;
    }

    /**
     * 查找中序后继节点
     * @param delNode
     * @return
     */
    public Node getSuccessor(Node delNode){
        Node successor = delNode;

        Node successorParent = delNode;

        Node current = delNode.getRightChild();
        while (current!=null){
            successorParent = successor;
            successor = current;
            current = current.getLeftChild();
        }
        if (successor != delNode.getRightChild()){
            successorParent.setLeftChild(successor.getRightChild());
            successor.setRightChild(delNode.getRightChild());
        }
        return successor;
    }


    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(10, "shi");
        tree.insert(15, "shiWu");
        tree.insert(3, "san");
        tree.insert(9, "jiu");
        tree.insert(42, "siEr");
        tree.insert(27, "erQi");

//        System.out.println("tree.root.getData() = " + tree.root.getData());
//        System.out.println("tree.root.getLeftChild().getData() = " + tree.root.getLeftChild().getData());
//        System.out.println("tree.root.getRightChild().getData() = " + tree.root.getRightChild().getData());
//        System.out.println("tree.root.getLeftChild().getRightChild().getData() = " + tree.root.getLeftChild().getRightChild().getData());
//
//        Node node = tree.find(3);
//        System.out.println("node.data = " + node.getData()+ " , node.sData = " + node.getSData());

        // 前序遍历
        tree.frontOrder(tree.root);
        System.out.println();
        System.out.println();

        // 中序遍历
        tree.middleOrder(tree.root);

        System.out.println();
        System.out.println();
        // 后序遍历
        tree.afterOrder(tree.root);

        // 删除
        boolean delete = tree.delete(15);
        System.out.println();
        System.out.println("delete = " + delete);
        tree.middleOrder(tree.root);

        boolean delete1 = tree.delete(10);
        System.out.println();
        System.out.println("delete1 = " + delete1);
        tree.middleOrder(tree.root);

        boolean delete2 = tree.delete(3);
        System.out.println();
        System.out.println("delete2 = " + delete2);
        tree.middleOrder(tree.root);
    }
}
