package Algorithms;
import java.util.Scanner;


//4 2 1 -1 -1 3  11 -1 -1 -1 7 6 -1 -1 9 -1 -1

public class BT_LeftView {

    static Scanner input = null;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        Viewnode rt = create();
        leftview(rt);
    }

    static Viewnode create() {
        Viewnode newnode;
        //System.out.println("Data :");
        int num = input.nextInt();
        if (num == -1) {
            return null;
        }
        newnode = new Viewnode(num);
        newnode.left = create();
        newnode.right = create();
        return newnode;

    }

    static void leftview(Viewnode rt) {
        if (rt == null) {
            return;
        }
        System.out.println(rt.value + "");
        leftview(rt.left);     
    }

}

class Viewnode {

    int value;
    Viewnode left, right;

    public Viewnode(int val) {
        this.value = val;
    }

}
