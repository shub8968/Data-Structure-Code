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
class MyTowerOfHanoi {
    /* private int x;
     private char A,B,C;
     public void getTower( int x)
     {
         this.x=x;
     }
     */
     public void move(int x, char from, char to,char inter) {
         if(x==1){
             System.out.println("Moving disc 1 from "+from+" to "+to);
         }
         else{
         move(x-1,from, inter,to);
         System.out.println("Moving disc "+x+" from "+from+" to "+to);
         move(x-1, inter,to,from);
         
     }
 }
}
     public class TowerOfHanoi {
     public static void main(String[] args) {
     MyTowerOfHanoi h=new MyTowerOfHanoi();
     char A,B,C;
     h.move(3,'A','B','C');
     
    }
}
    

