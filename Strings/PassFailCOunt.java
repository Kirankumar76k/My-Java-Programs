
package Strings;

import java.util.Scanner;

public class PassFailCOunt {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no of subjects");
        int n=sc.nextInt();
        if(n<=0)
        {
            System.out.println("invalid input range");
        }
        else
        {
        int count=0;
        int a[]=new int[n];
        for(int i =0;i<a.length;i++)
        {
           a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<=50)
            {
                count++;
            }
        }
        if(count==6)
        {
            System.out.println("ram failed in all subjects");
        }
        else if(count==0)
        {
            System.out.println("ram passed in all subjects");
        }
        else if(count>0)
        {
            System.out.println("ram passed in "+(n-count)+" subjects and failed in "+count+" subjects");
        }
        }
        
    }
}
