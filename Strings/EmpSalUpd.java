
package Strings;

import java.util.Scanner;

public class EmpSalUpd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter no of employees");
        n = sc.nextInt();
        Emp obj[] = new Emp[n];
        //System.out.println("enter employe name,experience,salary");
        for (int i = 0; i < obj.length; i++) {
            sc.nextLine();
            System.out.println("enter " + i + " employee name");
            String Empname = sc.nextLine();
            System.out.println("enter experience");
            int exp = sc.nextInt();
            sc.nextLine();
            System.out.println("enter salary");
            int salary = sc.nextInt();
            obj[i] = new Emp(Empname, exp, salary);
        }

//        System.out.println("incrementing salary 10% for those who have 5 years of experience in field");
//        System.out.println("\n\t\t\t updated list");
        Update(obj);
        System.out.println("enter a choice");
        int g = sc.nextInt();
        switch (g) {
            case 1:
                for (int i = 0; i < obj.length; i++) {
                    if (obj[i].getExp() >= 5) {
                        System.out.println(obj[i].getEmpname() + " " + obj[i].getSalary() + "\n");
                    }
                }
                break;
            case 2:
                for (int i = 0; i < obj.length; i++) {
                    if (obj[i].getExp() < 5) {
                        System.out.println(obj[i].getEmpname() + " " + obj[i].getSalary() + "\n");
                    }
                }
                break;
            default:
                System.out.println("oops you entered wrong choice try again");
                break;
        }

    }

    static void Update(Emp obj[]) {
        int res = 0;
        int k = 0;
        for (int i = 0; i < obj.length; i++) {
            if (obj[i].exp >= 5) {
                int j = (obj[i].getSalary() / 100) * 10;
                obj[i].setSalary(j + obj[i].getSalary());
            }
        }

    }
}
