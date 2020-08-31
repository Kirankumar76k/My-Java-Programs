//Encapsulation in java is a process of wrapping of code and data together  into single unit
//we can create fully encapsulated class by making all the data members into private
//by providing only a  getter and setter methods, u can make the class read only or write only
//so you can skip the getter and skipper methods
// it is a way to achieve data hiding in java because other class will not be able to access the
//data through the private data members.

//Constructor : Used to intialise the object instance variables ( In the case of parameterized constructor). Only invoked once while object creation.
//Getters : Getters are used to get the instance variable values.
//Setters : These methods are used to modify the instance variable values.
package Encapsulation;

import java.util.Scanner;

class Emp{
  private  int empid;
  private String name;
  private double salary;
   private String desgination;

    public Emp(int empid, String name, double salary, String desgination) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.desgination = desgination;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesgination() {
        return desgination;
    }

    public void setDesgination(String desgination) {
        this.desgination = desgination;
    }
   
}
public class EncDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Emp obj[]= new Emp[3];
        for(int i=0;i<3;i++)
        {
        System.out.println("enter the employee id");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the employee name");
        String name=sc.nextLine();
        System.out.println("enter the employee salary");
        double salary=sc.nextDouble();
        sc.nextLine();
        System.out.println("enter the employee designation");
        String Des=sc.nextLine();
      obj[i] = new Emp(id,name,salary,Des);
        }
        for(int i=0;i<3;i++)
        {
            if(obj[i].getSalary()>=1000)
            {
//                System.out.println(obj[i].getName());
                 obj[i].setDesgination("manager");      
            }
        }
        for(Emp var:obj){
        System.out.println(var.getName());
    }
        for(int i=0; i<3; i++)
        {
            System.out.println(obj[i].getDesgination());
        }
    }
}
