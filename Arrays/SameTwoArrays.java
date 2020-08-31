
package Arrays;

import java.util.Scanner;

public class SameTwoArrays {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n,m,i,j,flag=0;
         System.out.println("enter size of both arrays");
         n=sc.nextInt();
         m=sc.nextInt();
         if(n==m)
         {
         int a[]=new int[n];
         int b[]=new int[m];
         for (i = 0; i < n;i ++) {
            a[i]=sc.nextInt();
        }
         for(j=0; j<m;j++)
         {
             b[j]=sc.nextInt();
         }
         for (i = 0; i < n;i ++) {
                 if(a[i]!=b[i])
                 {
                     flag=1;
                     break;
                 }
         }   
         if(flag==1)
             System.out.println("not same");
         else
             System.out.println("same");
         }
         else
         {
             System.out.println("invalid array size");
         }
}
}
