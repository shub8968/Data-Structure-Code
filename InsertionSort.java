/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodesds;

import java.util.Scanner;

/**
 *
 * @author Shubham
 */
class MyInsertionSort
{
    int [] arr= new int[5];
    int a;
     
    public void setArr(int[] arr) {
        this.arr = arr;
    }
     public int [] sort()
     {
         for (int i=0; i <=arr.length-1;i++)
         { 
             int current = arr[i];
             a=i-1;
             while(a>=0 && arr[a]> current)
             {
                 arr[a+1]=arr[a];
                 a=a-1;
                 arr[a+1]= current;
                 
             }
             
         }
         return arr;
     }
         
     
    
    
}
public class InsertionSort {
    public static void main(String[] args) {
        {   int arr[]=new int[5];
            MyInsertionSort m=new MyInsertionSort();
            Scanner kb= new Scanner (System.in);
            for (int i=0;i<5;i++)
            {
                arr[i]=kb.nextInt();
                
            }
            
            m.setArr(arr);
            int arrb[];
            arrb=m.sort();
            System.out.println("Sorted array");
            for(int i=0;i<5;i++)
            {
                System.out.print(arrb[i]+",");   
            }
            
        }
    }
    
    
}
