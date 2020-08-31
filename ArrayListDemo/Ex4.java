//list is a interface which extends collection
package ArrayListDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        List<Integer> values=new ArrayList();
        values.add(40);
        values.add(1);
        values.add(433);
        values.add(90);
        values.add(338);
        //u cannot add values in b/w which means it doesnt work with indexes
        //and thats y we cannot even sort the items bcux we dont have indexes
        //thats we need to use list
        Collections.sort(values);//ascending
        Collections.reverse(values);//descending
        
 // using an iterator
//        Iterator i=values.iterator();
//        while(i.hasNext())
//        {
//            System.out.println(i.next());
//        }

//using enhanced for loop
//        for(Object i: values)
//        {
//        System.out.println(i);
//       }
   
 // we have one more way printing the elements
 
      values.forEach(System.out::println);
      //its a stream api which uses lambda expression
    
    
    }
}
