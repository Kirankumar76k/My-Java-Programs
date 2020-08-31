
package Strings;

import java.util.Scanner;

class Student{
    private String name;
    private int id;
    private int marks[];


    public Student(String name, int id, int[] marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }
    private char grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }


   
}
public class AvgGrdCalc {
     public static float Average(int marks[])
    {
        float average;
        int sum=0;
       for(int i=0;i<marks.length;i++)
       {
           sum=sum+marks[i];
       }
       average=sum/3;
       return average;
    }
     public static char grade(int marks[],float avg)
     {
         char grade=' ';
         for(int i=0;i<marks.length;i++)
         {
             if(marks[i]<=50)
             {
                 grade='F';
                 break;
             }
             else if(avg>=80)
             {
                 grade='O';
             }
             else if(avg>50&&avg<80)
             {
                 grade='A';
             }
             
         }
         return grade;
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      
        System.out.println("enter the id");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("enter name");
        String name=sc.nextLine();
        System.out.println("enter the no of subjects");
        int n=sc.nextInt();
        int marks[]=new int[n];
        for(int i=0;i<marks.length;i++)
        {
            System.out.println("enter the mark for subject "+i);
            marks[i]=sc.nextInt();
           
        }
        Student obj=new Student(name,id,marks);
        System.out.println("ID :"+obj.getId());
        
        System.out.println("Name :"+obj.getName());
        System.out.println("Average is"+Average(marks));
        System.out.println("Grade is "+grade(marks,Average(marks)));
    }
}
