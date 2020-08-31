
package Strings;

import java.util.Scanner;

public class CountFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        String names[]=s.split(" ");
        String mostreptd=null;
       int max=0;
       int erw=0;
       for(int i=0;i<names.length;i++)
       {
           erw=1;
          for(int j=i+1;j<names.length;j++)
          {
              if(names[i].equalsIgnoreCase(names[j]))
              {
                  erw++;
              }
          }
          if(max<erw)
          {
              max=erw;
              mostreptd=names[i];
          }
       }
        if(max>1)
       System.out.println(mostreptd+" repeated word " +max+"times");
        else
            System.out.println("no repeated words");
    }
        
}
