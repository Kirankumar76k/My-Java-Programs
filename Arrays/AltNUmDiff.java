package Arrays;

import java.util.Scanner;

public class AltNUmDiff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bigdif=0,diff=0,smallindex=5;
         System.out.println("enter array size"); 
        int size =sc.nextInt();
        
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size-2;i++)
        {
            diff=arr[i]-arr[i+2];
            if(diff<0)
            {
                diff=diff*(-1);
            }   
            System.out.println(arr[i]+"-"+arr[i+2]+"="+diff);
            if(bigdif<diff)
            {
                bigdif=diff;
                if(arr[i]>arr[i+2])
                {
                  smallindex=i+2;
                }
                else
                     smallindex=i;
            }
        }
        System.out.println(smallindex);
            
            }
        }
       
