
package Algorithms;

import java.util.Scanner;


public class QuickSort {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=input.nextInt();
        }
        
        quick(arr,0,n-1);
        System.out.println("After using quick sort :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");            
        }
        
        System.out.println("\n");
        
    }
    
    
    
        private static void quick(int arr[],int low, int high) 
        {
            if(low<high){
                int privt=Privt(arr,low,high);
                quick(arr,low,privt-1);
                quick(arr,privt+1,high);
            } 
        }
        
        
        
   
        public static int Privt(int arr[],int l,int h){
            int privt=arr[l];
            int i=l,j=h;
            while(i<j){
               while(arr[i]<=privt) i++;
               while(arr[j]>privt) j--;
               if(i<j){
                  swap(arr,i,j);
               }
            }
            swap(arr,l,j);
          return j;  
        }

        public static void swap(int[] arr, int i, int j) {
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
        }

   
    
}
