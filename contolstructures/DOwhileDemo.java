/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contolstructures;

import java.util.Scanner;

public class DOwhileDemo {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        do{
            System.out.println("1.Display");
            System.out.println("2.Exit");
            System.out.println("Enter your choice");
            i=sc.nextInt();    
        }while(i==1);
    }
    
}


