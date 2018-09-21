/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodesds;

/**
 *
 * @author Shubham
 */
import java.util.*;
public class LinearSearch{
    public static int search(int arr [],int n)
    {
        for(int i= 0 ; i<n; i++)
        {
            if(arr[i]==n)
            return i;
        }
        return -1;
    }
    public static void main(String [] args){
       Scanner kb = new Scanner(System.in);
       System.out.println("Enter size of array");
       int  k = kb.nextInt();
       kb.nextLine();
       int  arr [] = new int [k];
       System.out.println("Enter array element");
       for(int i = 0; i < k; i++){
           arr[i] = kb.nextInt();
       }
       System.out.println("Enter element to be search");
       int n = kb.nextInt();
       n=search(arr,n);
       System.out.println("The index of element is"+n);
    }
}
