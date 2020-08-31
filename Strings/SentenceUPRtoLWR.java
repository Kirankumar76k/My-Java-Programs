//Write a program to get a sentence as input. In the first word of the sentence keep
//the first character as it is and change the remaining to upper case, then in the second
//word keep the first two characters as it is and change the remaining to upper case. 
//Continue this pattern for the remaining words too
package Strings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SentenceUPRtoLWR {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a string: ");
        int count=0,k=0;
        String s=sc.nextLine(); 
        char res[]= new char[100];
        StringTokenizer token= new StringTokenizer(s);
        while(token.hasMoreTokens())
        {
            
            String ch=token.nextToken();
            char v[]= ch.toCharArray();
            count++;
            for(int i=0;i<v.length;i++)
            {
                if(count>i)
                {
                    res[k++]=v[i];
                }
                else
                {
                    res[k++]= (char) (v[i]-32);
                }
            }
            res[k++]=' ';
        }
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]);
        }
        //String j =String.valueOf(res);
       // System.out.println(j);
    }
}
