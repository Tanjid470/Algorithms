
package Algorithms;

import java.util.Arrays;
import java.util.Scanner;


public class BinarySearch {
     public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int[] ar={10,20,30,40,50,60};
        int len=ar.length;
         System.out.println("Select the value :");
        int value=sc.nextInt();
        int m=Arrays.binarySearch(ar, 0, len, value);
          if(m>=0)System.out.println("Position = "+m+"Row");
          else{
              System.out.println("Product Not Found");
          }
      }
    
}

//L-2.1 Gate Smashers YouTube


//.....................BinarySearch in Basic Algorithm

/*public class Test {

    public static boolean funn(int[] arr, int k, int start, int len) {
        int leen = len;
        int mid = (start + len) / 2;
        if (start <= len) {
            if (arr[mid] == k) {
                return true;
            } else if (arr[mid] > k) {
                return funn(arr, k, 0, mid - 1);
            } else {
                return funn(arr, k, mid + 1, leen);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = {1, 3, 5, 7, 9, 11, 13};
        int t = input.nextInt();
        int len = a.length;

        boolean rslt = funn(a, t, 0, len);
        System.out.println(rslt);

    }
}*/
