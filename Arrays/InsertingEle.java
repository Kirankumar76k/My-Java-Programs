
package Arrays;

import java.util.Scanner;

public class InsertingEle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a size of an array");
        int size=sc.nextInt();
        int a[] =new int[size+1];
        System.out.println("enter "+size+" elements");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter element do you want to insert");
        int temp=sc.nextInt();
        System.out.println("enter position you want to insert the element");
        int pos=sc.nextInt();
        if(pos>size)
            System.out.println("invalid array size");
        else
        {
            for(int i=(size-1);i>=(pos-1);i--)
            {
                a[i+1]=a[i];
            }
            a[pos-1]=temp;
            System.out.println("after inserting "+temp+"in"+pos+"position the elements are");
            for(int i=0;i<=size;i++)
            {
                System.out.println(a[i]+" ");
            }
        }
    }
}
