
package Strings;

import java.util.Scanner;

public class MailDomain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter no of mails");
        n = sc.nextInt();
        sc.nextLine();
        String[] s=new String[n];
        for(int i=0;i<s.length;i++)
        {
            s[i]=sc.nextLine();
        }
        for(int i=0;i<s.length;i++)
        {
            if(s[i].contains("zeezee.com")==false)
            {
                System.out.println(s[i]);
            }
        }
    }
}
