
package Strings;

import java.util.Scanner;



public class EmpString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of employees");
        int size=sc.nextInt();
        EmpString[] obj=new EmpString[size];
        for(int i=0;i<obj.length;i++)
        {
            System.out.println("Enter "+(i+1)+"employee name");
            String name=sc.nextLine();
            System.out.println("Enter Salary");
            float Sal=sc.nextFloat();
            
            
        }
        
    }
}
