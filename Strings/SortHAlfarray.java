
package Strings;

import java.util.Scanner;

public class SortHAlfarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size=sc.nextInt();
        int a[]=new int[size];
        int temp=0;
        System.out.println("enter the "+size+" elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length/2;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                 }
            }
        }
           for(int i=0;i<a.length;i++)
        {
            for(int j=(a.length/2);j<(a.length)-1;j++)
            {
                if(a[j]<a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                 }
            }
        }
        System.out.println("after sorting");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
}
}
