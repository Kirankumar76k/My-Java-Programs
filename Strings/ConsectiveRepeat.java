//Write a program to count the consecutive repeating characters
package Strings;

import java.util.Scanner;

public class ConsectiveRepeat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        int count=0;
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            count=1;
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                {
                    count++;
                }
            }
            if(count>1)
            System.out.println(ch[i]+""+count);
        }
    }
}
