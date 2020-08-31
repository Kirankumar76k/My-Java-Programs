//sum of all digits result is multiply with reverse of a result is equals to given digits.
package Basics;
//496
import java.util.Scanner;

public class Magic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0,rem=0,rev=0;
        System.out.println("enter a digit");
        int n=sc.nextInt();
        int temp=n;
        while(n>0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        int t2=sum;
        while(sum>0)
        {
            rem=sum%10;
            rev=rev*10+rem;
            sum=sum/10;
        }
        int res=t2*rev;
        System.out.println(res+" "+sum+" "+temp+" "+t2+" "+rev);
        if(res==temp)
        {
            System.out.println("its  a magic number");
        }
        else
        {
            System.out.println("its not a magic no");
        }
    }
}
