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
class MyJavaCodesDS{
   int a,b,c;

   

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
    public int code()
    {
        c=a%b;
        while(c!=0)
        {
         a=b;
         b=c;
         code();
        }
        return b;
        
        
    }
   
   
}
public class JavaCodesDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyJavaCodesDS A= new MyJavaCodesDS();
        Scanner kb=new Scanner(System.in);
        int a=kb.nextInt();
        int b=kb.nextInt();
        A.setA(a);
        A.setB(b);
        int c=A.code();
        System.out.println("GCD is "+c);
}
}
