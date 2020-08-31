
package Strings;

import java.util.Scanner;

public class ReplaceChar2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the word");
        String s=sc.nextLine();
        System.out.println("enter the character u want to search");
       String se=sc.nextLine();
        System.out.println("enter the character u want to replace");
        String rep=sc.nextLine();
        if(s.contains(se))
        {
            System.out.println(s.replace(se, rep));
        }
        else
        {
            System.out.println("character not found");
        }
    }
}
