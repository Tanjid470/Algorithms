package Algorithms;

import java.util.*;
import java.util.Scanner;

public class LevelOrder_BinaryTree {
static Scanner input=null;
    public static void main(String[] args) {
        input = new Scanner(System.in);
        NODE root=CreateTree();
        levelOrder(root);
    }

     static NODE CreateTree() {
        NODE newNode = null; // newNode Means Root of subtree
        System.out.print("Data : ");
        int data = input.nextInt();
        if (data == -1) {
            return null;
        }
        newNode = new NODE(data);
        System.out.println("Left of root :" + data);
        newNode.left = CreateTree();
        System.out.println("Right of root :" + data);
        newNode.right = CreateTree();
        return newNode;
    }
    
    
    public static void levelOrder(NODE root) {
        if (root == null) {
            return;
        }
        Queue<NODE> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            NODE curr = q.remove();
            if (curr == null) {
                System.out.println();
                //queue empty
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curr.data + " ");
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

}

class NODE{
    int data;
    NODE left;
    NODE right;
    public NODE(int data) {
        this.data = data;
    }
    
       
}