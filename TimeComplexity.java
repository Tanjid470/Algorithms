
package Algorithms;

import java.util.Scanner;


public class TimeComplexity {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n =input.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("Hello");                
            }
            
        }
    }
    
}
