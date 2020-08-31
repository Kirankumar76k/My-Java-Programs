
package Arrays;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of an array");
        int size = sc.nextInt();
        int j,k=0,flag=0;
        int a[] = new int[size];
        int b[] = new int[size];
        System.out.println("enter " + size + " elements");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
       for ( j = 0; j < size; j++) {
            b[j] = 0;
        }
         for(int i=0;i<size;i++)
         {
             flag=0;
             for( j=0;j<i;j++)
             {
             if(a[i]!=b[j])
             {
               flag=1;
             }
             }
             if(flag==0)
             {
                 b[k++]=a[i];
             }
         }
          for(k=0;k<b.length;k++)
         {
             System.out.println(b[k]);
         }}
}
 