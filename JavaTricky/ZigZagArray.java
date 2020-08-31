
package JavaTricky;

import java.util.Scanner;

public class ZigZagArray {
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int size=sc.nextInt();
        int temp=0;
        boolean var=true;
        int[] arr=new int[size];
        System.out.println("enter "+size+" elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("--------------------------------");
        for(int i=0;i<arr.length-1;i++)
        {    
            if(var==true)
            {
            if(arr[i]>arr[i+1])
            {
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            }
            else
            {
            if(arr[i]<arr[i+1])
            {
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            }
            var=!var;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
