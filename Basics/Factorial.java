
package Basics;

import java.util.Scanner;

public class Factorial {
   int n;
   int fact=1;
    public static void main(String[] args) {
         Factorial obj = new Factorial();
         
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check factorial");
        int n = sc.nextInt();
       
        System.out.println(obj.fact(n)); 
    }
     public int fact(int a)
    {
   
        if(a==0 || a== 1)
            return 1;
        else
        return a*(fact(a-1));
    }
}
