package javacodesds;

import java.util.Scanner;




/**
 *
 * @author Shubham
 */
class SimpleSorting{
    int arr[] = new int[5];
    int temp;
    
    public void setArr(int[] arr) {
        this.arr = arr;
    }
    
    public int [] sort()
    {
//        for (int i=0; i <arr.length-1;i++)
//           {
//            for(int j=0; j<arr.length-i-1;j++)
//
//            {
//             if(arr[j]>arr[j+1])
//                 temp=arr[j+1];
//             arr[j+1]=arr[j];
//             arr[j]=temp;
//            }
//            }
//        return arr;
        
        for(int i = 0 ; i < arr.length - 1; i++){
            
            
            for(int j = i+1 ; j < arr.length; j++){
                
                if(arr [i] > arr [j]){
                    
                    int temp = arr [j];
                    arr [j] = arr [i];
                    arr [i] = temp;
                }
                
            }
        }
        
        return arr;
    }
    //[-4,-1,0,3,10]
}
public class SimpleSortingAlgo {
    
    public static void main(String[] args) {
        {   int arr[]=new int[5];
            MyBubbleSort m=new MyBubbleSort();
            Scanner kb= new Scanner (System.in);
            for (int i=0;i<5;i++)
            {
                arr[i]=kb.nextInt();
                
            }
            
            m.setArr(arr);
            int arrb[]=new int[5];
            arrb=m.sort();
            System.out.println("Sorted array");
            for(int i=0;i<5;i++)
            {
                System.out.print(arrb[i]+",");
            }
            
        }
    }
}
