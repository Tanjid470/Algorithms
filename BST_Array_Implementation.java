package Algorithms;

import java.util.Scanner;

public class BST_Array_Implementation {

    public static Mynode insert(Mynode root, int value) {
        if (root == null) {
            root = new Mynode(value);
            return root;
        }
        if (root.data < value) {
            root.right = insert(root.right, value);
        } else {
            root.left = insert(root.left, value);
        }
        return root;
    }

    static void Inorder(Mynode root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            int[] value = {5, 1, 3, 4, 2, 7};
            Mynode root = null;
            for (int i = 0; i < value.length; i++) {
                root = insert(root, value[i]);
            }
            Inorder(root);
        } catch (Exception e) {
            System.out.println("Catch");
        }
    }
}

class Mynode {

    int data;
    Mynode left;
    Mynode right;

    public Mynode(int data) {
        this.data = data;
    }

}
