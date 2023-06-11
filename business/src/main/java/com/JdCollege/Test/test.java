package com.JdCollege.Test;

import java.util.LinkedList;
import java.util.Queue;

public class test {
    //枚举类型创建单例对象
    /*enum Singleton {
        single;
    }*/

    //递归思想求和
    static int sum(int i) {
        if (i == 1) return 1;
        else return i + sum(i - 1);
    }

    //数组长度为满时将100插入到6的后面
    static int[] join() {
        int[] arr = new int[9];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        //数组长度为满时将100插入到6的后面
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if (arr[i] == 6) {
                    arr[i + 2] = arr[i + 1];
                    arr[i + 1] = 100;
                }
            } else {
                break;
            }
        }
        return arr;
    }

    //定义一个方法用于数组长度满时扩容两倍长度，新增元素
    static int[] Dilatation(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = number;
                break;
            }
            if (i == arr.length - 1) {
                int[] numsNew = new int[arr.length * 2];
                System.arraycopy(arr, 0, numsNew, 0, arr.length);
                numsNew[i + 1] = number;
                arr = numsNew;
                System.out.println("扩容后数组长度为：" + arr.length);
                break;
            }
        }
        return arr;
    }

    //斐波那契数列
    static int fun(int n) {
        if (n <= 1) return 1;
        return fun(n - 1) + fun(n - 2);
    }

    //循环输出指定字符串指定次数
    static void print(String ss, int i) {
        if (i > 0) {
            System.out.println(ss);
            print(ss, (i - 1));
        }
    }

    //二分查找某个有序数组中的元素，并返回对应的下标
    static int FindIndex(int[] arr, int n) {
        int low = 0;//定义低位索引
        int high = arr.length - 1;//定义高位索引
        int mid = 0;//定义中间索引
        while (low <= high) {//条件，低位索引小于等于高位索引
            mid = (low + high) / 2;//中间索引等于高低位索引和的二分之一
            if (n == arr[mid]) {//如果输入的值刚好等于中间索引mid对应的值，则直接返回
                return mid;
            } else if (n < arr[mid]) {//如果输入的值小于mid索引处对应的值，则将高位索引移动到mid索引的前一个位置
                high = mid - 1;
            } else {//如果输入的值大于mid索引处对应的元素值，则将低位索引移动到mid的后一个位置
                low = mid + 1;
            }
        }
        return -1;
    }


    //递归思想二分查找某个有序数组中的元素，并返回对应的下标
    static int FindIndexDG(int[] arr, int number) {//用户传入数组和需查询的元素
        int count = 0;//给一个变量用于记录数组中非空元素，避免不必要的查询
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                count++;
            }
        }
        return FindIndexDGUtil(arr, count, 0, number);//调用具体方法
    }

    static int FindIndexDGUtil(int[] arr, int high, int low, int number) {//参数定义高位索引和低位索引以及数组和具体传入的元素
        int mid = (high + low) / 2;//定义一个中间索引进行二分查询
        if (low > high) return -1;//如果低位大于高位，说明查询不到，返回-1，结束递归（递归结束条件）
        if (arr[mid] == number) return mid;//如果number刚好等于mid对应的数值，直接返回mid
        if (arr[mid] < number) {
            return FindIndexDGUtil(arr, high, mid + 1, number);//如果number大于mid索引处的值，则采用递归思想进行索引位置的变化并计算
        } else {
            return FindIndexDGUtil(arr, mid - 1, low, number);//如果number小于mid索引处的值，则采用递归思想进行索引位置的变化并计算
        }
    }

    /**
     * 使用递归思想创建一棵二叉查找树
     */
    static TreeNode root;//创建根节点

    static void InsertNode(int data) {
        root = Insert(root, data);
    }

    static TreeNode Insert(TreeNode node, int data) {//传入原节点信息以及插入的数据
        if (node == null) return new TreeNode(data);//如果没有则说明为空，创建一个节点直接返回，该节点就是根节点
        if (node.data < data) {//说明比父节点大，插在父节点的右边，右孩子
            node.RightChild = Insert(node.RightChild, data);
        } else if (node.data > data) {//说明比父节点小，插在父节点的左边，左孩子
            node.LeftChild = Insert(node.LeftChild, data);
        } else {
            node.data = data;//说明就是本身，相当于只有这一个节点
        }
        return node;//将节点返回
    }

    /*
    前序遍历:遍历顺序，根左右
     */
    static void BeforeTraver(TreeNode node) {
        if (node == null) return;//为空说明没有节点存在，没有元素
        System.out.println(node.data);//输出根元素遍历到的第一个肯定是根元素
        BeforeTraver(node.LeftChild);//递归遍历左节点的左孩子
        BeforeTraver(node.RightChild);//递归遍历右节点的右孩子
    }

    /*
    中序遍历：遍历顺序，左根右
     */
    static void MidTraver(TreeNode node) {
        if (node == null) return;//为空则说明说没有节点，直接返回null即可
        MidTraver(node.LeftChild);
        System.out.println(node.data);
        MidTraver(node.RightChild);
    }

    /*
    后序遍历：遍历顺序，左右根
     */
    static void AfterTraver(TreeNode node) {
        if (node == null) return;//为空则说明说没有节点，直接返回null即可
        AfterTraver(node.LeftChild);
        AfterTraver(node.RightChild);
        System.out.println(node.data);
    }

    /*
    广度优先遍历：一层一层的遍历打印
     */
    static void BreadthTraver(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);//根节点入队
        while (!queue.isEmpty()) {//条件为queue集合中还有元素，不为空
            TreeNode node = queue.poll();//队头出队并删除
            System.out.println(node.data);
            if (node.LeftChild != null) {//若左孩子不为空，则左孩子入队
                queue.offer(node.LeftChild);
            }
            if (node.RightChild != null) {//若右孩子不为空，则右孩子入队
                queue.offer(node.RightChild);
            }
        }
    }

    /*
    冒泡排序：定义一个方法用于数组的冒泡排序
     */
    static int[] Bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {//因为不需要和自己比，所以应该长度-2，即<len-1（外层定义循环次数）
            for (int j = 0; j < arr.length - 1 - i; j++) {//-i是因为排序过的就不用再重复排序了
                int temp = 0;//定义临时变量用于交换
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        /*test.InsertNode(8);
        test.InsertNode(9);
        test.InsertNode(12);
        test.InsertNode(5);
        test.InsertNode(7);
        test.InsertNode(10);
        test.InsertNode(4);
        test.InsertNode(15);
        test.InsertNode(1);
        test.InsertNode(3);*/
//        test.BeforeTraver(root);
//        test.MidTraver(root);
//        test.AfterTraver(root);
//        test.BreadthTraver(root);
        /*int[] arr = {1, 3, 5, 66, 34, 7, 4, 99, 2};
        int[] bubble = test.Bubble(arr);
        System.out.println(Arrays.toString(bubble));*/
//        System.out.println((0.1+0.2));
        System.out.println("GitHub做了新的更改");
        System.out.println("GitHub做了新的更改");
    }

}
