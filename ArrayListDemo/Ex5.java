
package ArrayListDemo;

import java.util.ArrayList;
import java.util.ListIterator;

public class Ex5 {
    public static void main(String args[]){  
    ArrayList<String> list=new ArrayList<String>(); 
           list.add("kishore");
           list.add("geera");  
           list.add("avi");  
           list.add("kukuru");  
    System.out.println("Traversing list through List Iterator:");  
           //Here, element iterates in reverse order  
              ListIterator<String> list1=list.listIterator(list.size());  
              while(list1.hasPrevious())  
              {  
                  String str=list1.previous();  
                  System.out.println(str);  
              }  
}}
