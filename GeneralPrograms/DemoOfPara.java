
package GeneralPrograms;

import java.util.Scanner;


public class DemoOfPara {
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three numbers");
       int x=sc.nextInt();
       int y=sc.nextInt();
       int z=sc.nextInt();
       if((x>y)&&(x>z)){
           System.out.println(x+"is a largest number");
    }
       else if((y>x)&&(y>z)){
            System.out.println(y+"is a largest number");
       }
       else
       {
            System.out.println(z+"is a largest number");

       }
    }
}
