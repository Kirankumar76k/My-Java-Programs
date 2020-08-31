
package Arrays;

import java.util.Scanner;

public class SmallBig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int big=0,small=9999;
        System.out.println("enter an array size");
        int n=sc.nextInt();
        System.out.println("enter "+n+" elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(big<arr[i])
            {
                big=arr[i];
            }
            if(small>arr[i])
            {
                small=arr[i];
            }
        }
        System.out.println("biggest array element is"+big);
        System.out.println("Smallest array element is"+small);
    }
   
}
