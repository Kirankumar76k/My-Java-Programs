
package collections_and_generics;

import java.util.*;

public class ALeg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Collection al= new ArrayList();
        al.add("kihihiuhiu");
        al.add(2);
        al.add("kainasv");
        
        Set mem=new TreeSet();
        System.out.println(al);
        Object[] o=new Object[4]; 
            o[0]=sc.nextLine();
             o[1]=sc.nextInt();
              o[2]=sc.nextInt();
           for(int i=0;i<o.length;i++)
       {          System.out.println(o[i]);
    }
    }
}
