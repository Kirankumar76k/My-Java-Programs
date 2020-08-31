//multi threading is a process of small tasks exectues parallelly
//we can achieve multithreading in two ways
//1.through extends Thread class(Inheritance)
//2.By implementing runnable interface
//this program demonstrates how multithreading works
package Multithreading;

import java.util.Scanner;

public class first extends Thread {
    static int count=0; 
    public void display()
    {
        System.out.println("sdfkjgnsfvsfjkv");
    }
    public void run()
    {
        count++;
        System.out.println(" hy bokari"+count);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        first obj=new first();
        first obj1= new first();
        first obj2=new first();
        obj.start();
        obj1.start();
        obj2.start();
         obj.start();
        obj1.start();
        obj2.start();
    }
}
