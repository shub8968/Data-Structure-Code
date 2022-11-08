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
class Node{
    private int data;
    private Node nextNode;
    public Node ( int data){
        this.data=data;
    }
    public int getData() {
        return this.data;
    }

    public Node getNextNode() {
        return this.nextNode;
    }
    
    public void setData( int data){
        this.data=data;
        
    }
    public void setNextNode(Node nextNode){
        this.nextNode=nextNode;
    }
    @Override
    public String toString()
    {
        return " Data: "+this.data;
    }
}
 class MyLinkedList {
    private Node head;
    public void insertAtHead( int data){
        Node n = new Node(data);
        n.setNextNode(this.head);
        this.head=n;
        }
     @Override
    public String toString()
    {
        String r= " {";
        Node current = this.head;
        while (current != null)
        {
            r+= current.toString() + ",";
            current=current.getNextNode();
        }
        r += "}";
        return r;
    }
}
public class LinkedList{
    public static void main(String[] args) {
        MyLinkedList l = new MyLinkedList();
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to insert");
        int a=kb.nextInt();
        System.out.println("Enter the elements");
        {
            for ( int i=0; i<a; i++)
            {
                int b=kb.nextInt();
                l.insertAtHead(b);
            }
        }
        System.out.println(l);
    }
    
}