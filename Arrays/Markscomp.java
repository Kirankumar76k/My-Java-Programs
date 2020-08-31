
package Arrays;

import java.util.Scanner;

public class Markscomp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int ko=0;
        System.out.println("enter first array size"); 
        int size1 =sc.nextInt();
         System.out.println("enter second array size"); 
         int size2 =sc.nextInt();
         if(size1==size2){
         int[] krn=new int[size1];
        int[] res=new int[5];
        for(int i=0;i<size1;i++)
        {
           krn[i]=sc.nextInt();
        }
        
        int[] som=new int[size2];
        for(int i=0;i<size2;i++)
        {
           som[i]=sc.nextInt();
        }
        for(int i=0;i<size1;i++)
        {
            for(int j=0;j<size2;j++)
            {
                if(krn[i]==som[j])
                {
                    ko=1;
                    System.out.println("("+i+","+j+")");
                }
            }
        }
    }
         else
         {
             System.out.println("invalid array size");
         }
         if(ko==0)
         {
             System.out.println("no matching scores");
         }
}}
