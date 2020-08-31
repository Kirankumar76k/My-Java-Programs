
package Strings;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the word");
        String s=sc.nextLine();
        int count=0;
        String rev="";
        String g=null;
        g="kiran";
        for(int j=s.length()-1;j>=0;j--)
            {
               rev=rev+s.charAt(j);     
            }
        System.out.println(g);
        if(s.equalsIgnoreCase(rev))
        {
            System.out.println(rev+" is a pallindrome");
            
        }
        else
        {
            System.out.println(s+" is not pallindrome");
    }
}
}

