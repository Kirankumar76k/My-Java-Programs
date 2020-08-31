
package GeneralPrograms;

import java.util.Scanner;
public class ScannerClass {
   int a;
//scanner class is not created in Class
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int x,a;
      ScannerClass obj = new ScannerClass();
          System.out.println(obj instanceof ScannerClass);
        System.out.println("enter a no and name");
        //string doesnt consider after integer
        //but integer takes after integer(float,double long int etc.,)
              String  b=sc.nextLine();
              a=sc.nextInt();
              x=sc.nextInt();
              System.out.println("");
          
      // String  b=sc.nextLine();
       
    }
}
