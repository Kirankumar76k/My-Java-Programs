
package ConstructorDemo;

import java.util.Scanner;

public class Student {

    private int no;//instance variables loads memory every time when object is created.
    private String name;
    private int marks;

    public Student(int no, String name, int marks) {
        this.no = no;
        this.name = name;
        this.marks = marks;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}

class solution {

    public static Student[] above(Student[] obj , int limit)
    {
        int j=0;
         for (int i = 0; i < 3; i++) {
            if(obj[i].getMarks()>=limit)
            {
                j++;
            }
        }
         
         Student[] r=new Student[j];
         j=0;
        
        for (int i = 0; i < 3; i++) {
            if(obj[i].getMarks()>=limit)
            {
                r[j++]=obj[i];
            }
        }
            return r;
        }
        
        
    
    
    
    //int a[]=new int[5];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] obj = new Student[5];
        for (int i = 0; i <3; i++) {
            System.out.println("enter student id==>"+i);
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("enter student name");
            String name = sc.nextLine();
            System.out.println("enter student marks");
            int marks = sc.nextInt();
            obj[i] = new Student(id, name, marks);
        }
        System.out.println("enter limit for marks");
        int l =sc.nextInt();
        Student[] fun =above(obj,l);
        for(Student res: fun)
        {
            System.out.println(res.getNo()+""+res.getName()+""+res.getMarks());
        }
        for(int i=0;i<fun.length;i++)
        {
            System.out.println(fun[i].getNo()+""+fun[i].getName()+""+fun[i].getMarks());
        }
    }
}
