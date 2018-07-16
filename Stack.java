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
class MyStack {
    private int top,x;
    
    int arr []= new int[5];
    MyStack ()
    {
        top=-1;
        x=-2;
    }
    public void push(int a)
    {
        if(top<5)
        {
            
            arr [++top]=a;
        }
    }
    public int pop( )
    {
       
     if (top!=-1)
     {
         x = arr [top --];
         
         
     }
     
     return x;
     }   
    public int peek ()
    {
        return arr [top];
    }
    }
    

public class Stack {
    public static void main(String[] args) {
        MyStack k= new MyStack();
        int a;
        k.push(5);
        k.push(8);
        k.push(7);
        k.push(1);
        a=k.pop();
        
        System.out.println("poped element is"+a);
        a=k.pop();
        System.out.println("poped element is"+a);
    }
}
