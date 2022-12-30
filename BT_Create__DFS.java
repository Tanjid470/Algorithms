package Algorithms;

import java.util.Scanner;

/*
           Binary Tree
                4
               / \
              /   \
            2       7
           / \     / \
          /   \   /   \
         1     3 6     9
*/
public class BT_Create__DFS {

    static Scanner input = null;

    public static void main(String[] args) {
        try
        {        input = new Scanner(System.in);
        NODE root = CreateTree();
        System.out.print("\n\n\nInorder   :");
        inOrder(root);
        System.out.print("\npreOrder  :");
        preOrder(root);
        System.out.print("\npostOrder :");
        postOrder(root);
        System.out.println("\nInvert Order : ");
        invertTree( root);}
        catch(Exception e){
            System.out.println("Catch");
        }
        
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

    static void inOrder(NODE root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static void preOrder(NODE root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void postOrder(NODE root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

     static NODE invertTree(NODE root) {
      if(root==null)
          return null;
      NODE temp=root.left;
      System.out.print(root.data+" ");
      root.left=invertTree(root.right);
      root.right=invertTree(temp); 
      
      return null;
    }
    
}

class NODE {

    NODE left, right;
    int data;

    public NODE(int data) {
        this.data = data;
    }
}
