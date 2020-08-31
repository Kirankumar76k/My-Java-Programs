
package Strings;

import java.util.Scanner;

public class Pallindrome2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the word");
        int i=0,count=0;
        String s=sc.nextLine();
        char ch[]= s.toCharArray();
        int len=ch.length-1;
        while(i<len)
        {
            if(ch[i++]!=ch[len--])
            {
                count++;
                System.out.println("not pallindrome");
                break;
            }
        }
        if(count==0)
        {
            System.out.println(s+" is  a pallindrome");
        }
    }
}
