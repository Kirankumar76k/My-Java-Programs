
package ArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Ex6 {
     public static void main(String[] args) {
        int i=0,m=0;
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> obj=new ArrayList();
        while(i<5)
        {
            m=sc.nextInt();
            obj.add(m);
            i++;
        }
     
        System.out.println(obj);
        Collections.sort(obj);
        System.out.println(obj);
        
        
    }
}
