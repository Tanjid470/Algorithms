package Algorithms;

import java.util.Scanner;
import java.util.*;

/*  4 2 1 -1 -1 3 -1 -1 5 -1 6 -1 -1  */
public class BST{

    static Scanner input = null;

    public static void main(String[] args) {
        try{
        input = new Scanner(System.in);

        NodeMy root = BST();
        System.out.print("Key :");
        int key = input.nextInt();
        boolean x = BS(root, key);
        System.out.println(x);
        inorder(root);}
        catch(Exception e){
            System.out.println("Catch");
        }
    }

    static NodeMy BST() {
        NodeMy newnode = null;
        int val = input.nextInt();
        if (val == -1) {
            return null;
        }

        newnode = new NodeMy(val);
        newnode.left = BST();
        newnode.right = BST();
        return newnode;
    }

    public static boolean BS(NodeMy root, int key) {
        if (root == null) {
            return false;
        } else if (root.val > key) {
            return BS(root.left, key);
        } else if (root.val < key) {
            return BS(root.right, key);
        } else if (root.val == key) {
            return true;
        }
        return false;
    }

    static void inorder(NodeMy root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
}

class NodeMy {

    int val;
    NodeMy left;
     NodeMy right;

    public NodeMy(int val) {
        this.val = val;
    }
}
