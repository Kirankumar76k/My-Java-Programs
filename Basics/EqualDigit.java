
package Basics;

import java.util.Scanner;

public class EqualDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rem=0,count=0;
        System.out.println("Enter a digit");
        int n=sc.nextInt();
        int temp=n%10;
        while(n>0)
        {
            rem=n%10;
            if(temp!=rem)
            {
                count++;
                break;
            }
            n=n/10;
        }
        if(count==0)
        {
            System.out.println("All digits in given number is equal");
        }
        else
        {
            System.out.println("Not equal");
        }
    }
}
