
package Strings;

import java.util.Scanner;

public class AmazonAccess {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Amazonpojo[] obj=new Amazonpojo[3];
        for (int i=0;i<obj.length;i++)
        {
            System.out.println("Enter employee name");
            String name=sc.nextLine();
            System.out.println("Enter salary");
            float sal=sc.nextFloat();
            System.out.println("Enter age");
            int age=sc.nextInt();
            sc.nextLine();
            obj[i]=new Amazonpojo(name,sal,age);
        }
        System.out.println("Before updating details");
        display(obj);
       
        System.out.println("enter age to update salary");
        int upage=sc.nextInt();
        
        update(obj,upage);
         System.out.println("After Updating");
         display(obj);
    }
    public static void update(Amazonpojo o[],int k)
    {
         for(int i=0;i<o.length;i++)
        {
            if(o[i].getAge()>=k)
            {
                o[i].setSalary(15000);
            }
        }
    }
    public static void display(Amazonpojo obj[])
    {
        for(int i=0;i<obj.length;i++)
        {
            System.out.println(obj[i].getEmpname());
            System.out.println(obj[i].getSalary());
            System.out.println(obj[i].getAge());
        }
    }
    
        
        
}
