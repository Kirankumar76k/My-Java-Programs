//Iterating ArrayList using Iterator
package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<String> obj=new ArrayList();
        obj.add("hello");
        obj.add("world");
        obj.add("bm");
        //traversing list through iterator
        Iterator i=obj.iterator();//getting the itterator
        while(i.hasNext())//checking if itterator has elements
        {
            System.out.println(i.next());//printing the element and move to next
        }
        
    }
}
