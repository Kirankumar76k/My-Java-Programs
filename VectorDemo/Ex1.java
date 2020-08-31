//Vector is like the dynamic array which can grow or shrink its size.
package VectorDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Ex1 {

	public static void main(String[] args) {
		//System.out.println("kiran is a goodboy");
                //ArrayList v=new ArrayList();
	                Vector v=new Vector();// 100% / threadsafe / slow
		v.add("kiran");
		v.add(3323);
		v.add("4r23");
                                 v.add("kiran");
		v.add(3323);
		v.add("4r23");
		v.add("4r23");
		v.add(3323);
		v.add("4r23");
                                v.add("kiran");
                                v.add("kiran");
		v.add(3323);
		v.add("4r23");
                                 v.add("kiran");
		v.add(3323);
		v.add("4r23");
		v.add("4r23");
		v.add(3323);
		v.add("4r23");
                                v.add("kiran");
                                v.add(0000);
	  //         System.out.println(v.size());	
                System.out.println(v.capacity());
		Iterator i=v.iterator();
		while(i.hasNext()) {
		System.out.println(i.next());
		
		}
	}}


