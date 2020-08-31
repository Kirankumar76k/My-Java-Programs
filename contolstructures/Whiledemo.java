package contolstructures;

import java.util.Scanner;

public class Whiledemo {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        System.out.println("Enter A no to print multiplication table");
        int n=sc.nextInt();
        int i=1;//intialization
        while(i<=10)//condition
        {
            System.out.println(n+"x"+i+"="+(n*i));//statement
            i++;//increment
        }
        
    }

}


