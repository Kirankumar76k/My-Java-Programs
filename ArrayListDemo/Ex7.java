 


package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student{
  int rollno;  
  String name;  
  int age;  
 Student(int rollno,String name,int age){  
   this.rollno=rollno;  
   this.name=name;  
   this.age=age;  
  }  
}
public class Ex7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      //Creating user-defined class objects  
  Student s1[]=new Student[3];  
  for(int i=0;i<s1.length;i++)
  {
      
      int a=sc.nextInt();
            sc.nextLine();
      String s=sc.nextLine();

      int c=sc.nextInt();
      s1[i]=new Student(a,s,c); 
  }
  
  //creating arraylist  
  ArrayList<Student> al=new ArrayList<Student>();  
  for(int i=0;i<s1.length;i++)
  {
  al.add(s1[i]);
  }//adding Student class object
  //Getting Iterator  
  Iterator itr=al.iterator();  
  //traversing elements of ArrayList object  
  while(itr.hasNext()){  
    Student st=(Student)itr.next();  
    System.out.println(st.rollno+" "+st.name+" "+st.age);  
  }  
 }  
}     

