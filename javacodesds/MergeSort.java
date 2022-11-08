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
     merge(arr,l,m,h);
     
    
    
}
    public void merge(int ar [],int l, int m, int h)
    {
        int [] b= new int [5];
         int [] c= new int [5];
         int x=m-l+1;
         int y=h-m;
          /* Create temp arrays */
        int L[] = new int [x]; 
        int R[] = new int [x]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<x; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<y; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < x && j < y) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < x) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < y) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
         
         
    }
 

