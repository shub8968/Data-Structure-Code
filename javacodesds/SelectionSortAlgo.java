package javacodesds;

public class SelectionSortAlgo {

public int [] selectionSort(int arr []){
    
    for(int i = 0 ; i < arr.length; i ++){
        
        int min = arr[i];
        for(int j = i + 1; j < arr.length; j++){
            
            if(min > arr[j]){
                min = arr[j];
            }
            if(min != arr[i]){
                int temp = arr[j];
                min = arr[i];
                arr[i] = temp;
            }
        }
       
    }
    
    
    return arr;
}
}
