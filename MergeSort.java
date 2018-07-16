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
class MyMergeSort {
    private int arr []=new int [10];
    int m,l,h;
    public void getArr( int ar [])
    {
        System.arraycopy(ar, 0, arr, 0, 10);
    }
    public void mergeSort(int ar [],int m,int h)
    {
     
     if(l<h)  
     m=(l+h)/2;
     mergeSort(arr,l,m);
     mergeSort(arr,m+1,h);
     
    
    
}
    public void merge(int ar [],int l, int m, int h)
    {
        int [] b= new int [5];
         int [] c= new int [5];
         int x=m-l+1;
         int y=h-m;
         
         
         
    }
    {
        
    }
}
public class MergeSort {
    
}
