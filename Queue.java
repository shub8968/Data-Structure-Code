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
class MyQueue
{
    int arr [] = new int [5];
    int head, tail,a;
    MyQueue() {
    head=0;
    tail=-1;
}
    
    public void push (int a)
    {
        if(tail<5)
        {
            arr [++tail]= a;
        }
        System.out.println("pushed element "+a);
    }
    public int pop ()
    {
        if(head<=tail )
        {
            a= arr[ head++];
        }
        return a;
    }
}
public class Queue {
    public static void main(String[] args) {
        {
            MyQueue q= new MyQueue ();
            
            q.push(5);
            q.push(6);
            q.push(7);
            q.push(8);
            System.out.println(q.pop());
            System.out.println(q.pop());
            System.out.println(q.pop());
            
            
            
                 
        }
    }
    
}
