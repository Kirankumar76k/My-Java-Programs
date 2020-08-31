
package contolstructures;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age");
        int age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("major"); 
        }
        else{
            System.out.println("minor need "+(18-age)+" more years");
        }
    }
    
}


