
package Strings;

import java.util.Scanner;

public class AverageAge {
    public static float avg(int age[])
    {
        float avg=0,sum=0;
        for(int i=0;i<age.length;i++)
        {
            sum=sum+age[i];
        }
        avg=sum/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter total no of employees");
        int n=sc.nextInt();
        System.out.println("Enter the age of "+n+" employees");
        int age[]= new int [n];
        for(int i=0;i<age.length;i++)
        {
            age[i]=sc.nextInt();
        }
        System.out.println("the average age is"+avg(age));
    }
}
