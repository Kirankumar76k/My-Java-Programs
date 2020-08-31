//collection is a topic or a concept
//Collection is a interface.. 
//Collections is a class
package collections_and_generics;

import java.util.*;

public class First {   
    public static void main(String[] args) {
        First j=new First();
        int i=0,m=0;
        Scanner sc=new Scanner(System.in);
        ArrayList obj=new ArrayList();
        Object k=new Object();
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
