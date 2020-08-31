
package Strings;

import java.util.Scanner;

public class SearchCourse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of course");
        int n=sc.nextInt();
        if(n<=0)
        {
            System.out.println("invalid range");
        }
        else
        {
        sc.nextLine();
        String s[]=new String[n];
        int flag=0;
        System.out.println("Enter course names");
        for(int i=0;i<s.length;i++)
        {
            s[i]=sc.nextLine();
        }
        System.out.println("Enter the course to be searchead");
        String search=sc.nextLine();
        for(int i=0;i<s.length;i++)
        {
            if(search.equalsIgnoreCase(s[i]))
            {
                flag=1;
                System.out.println(search+" is available");
                break;
            }
        }
        if(flag==0)
        {
            System.out.println(search+" is not available");
        }
    }
    }  
}
