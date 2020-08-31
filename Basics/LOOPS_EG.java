
package Basics;
import java.util.*;
import java.io.*;

 class LOOPS_EG{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int sum=0,res=0;
        System.out.println(2^0);
        System.out.println(2^1);
        System.out.println(2^2);
        System.out.println(2^3);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++)
            {
                sum=(a+2^j*b);
                res=sum+res;
                arr[j]=res;
                System.out.println(2^1);
            }
            for(int k=0;k<arr.length;k++)
            {
                System.out.print(arr[k]+" ");
            }
            
        }
        in.close();
    }
}