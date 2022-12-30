package Algorithms;

import java.util.Scanner;

/*  4 2 1 -1 -1 3 -1 -1 7 6 -1 -1 9 -1 -1  */
public class BT_Reverse_Height_Nodes {

    static Scanner input = null;
    static int count = 0;
    static int sum = 0;

    public static void main(String[] args) {
        try {
            input = new Scanner(System.in);
            TEMP root = crt();
            System.out.print("\nTotal Nodes : " + totalNode(root));
            System.out.print("\nLevels      : " + level(root));
            System.out.print("\nSum of Nodes: " + sumNodes(root));
            int m = Max(root);
            System.out.print("\nMax Value   :" + m);
            /*   Reverse Change the tree  */
            System.out.print("\nReverse tree : ");
            reverseTree(root);
        } catch (Exception e) {
            System.out.println("Catch");
        }

    }

    static TEMP crt() {
        TEMP newnode = null;
        int data = input.nextInt();
        if (data == -1) {
            return null;
        }
        newnode = new TEMP(data);
        newnode.left = crt();
        newnode.right = crt();

        return newnode;
    }

    static TEMP reverseTree(TEMP root) {
        if (root == null) {
            return null;
        }
        TEMP temp = root.left;
        System.out.print(root.data + " ");
        root.left = reverseTree(root.right);
        root.right = reverseTree(temp);
        return null;
    }

    static int totalNode(TEMP root) {
        if (root == null) {
            return 0;
        }
        int l = totalNode(root.left);
        int r = totalNode(root.right);
        return l + r + 1;
    }

    static int level(TEMP root) {
        if (root == null) {
            return 0;
        }
        int x = level(root.left);
        int y = level(root.right);
        return Math.max(x, y) + 1;
    }

    static int sumNodes(TEMP root) {
        if (root == null) {
            return 0;
        }
        sumNodes(root.left);
        sum += root.data;
        sumNodes(root.right);
        return sum;
    }

    // Find out the maximum value of tree
    // Minimm value find as same way..just replace min in max place
    static int Max(TEMP root) {
        if (root == null) {
            return 0;
        }
        return Math.max(root.data, Math.max(Max(root.left), Max(root.right)));
    }

}

class TEMP {

    int data;
    TEMP left;
    TEMP right;

    public TEMP(int data) {
        this.data = data;
    }

}
