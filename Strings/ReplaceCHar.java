
package Strings;

import java.util.Scanner;

public class ReplaceCHar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        System.out.println("enter the character to be searched");
       String search=sc.nextLine();
       char se=search.charAt(0);
        System.out.println("enter the character to be replaced");
        String rep=sc.nextLine();
        char re=rep.charAt(0);
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==se)
            {
                ch[i]=re;
            }
        }
        for(int i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]);
        }
        
        
        
        
//        if(search.contains(s))
//        System.out.println(s.replace(se, re));
//        else
//            System.out.println("character not found");
//    }
}}
