//Iterating ArrayList using For-each loop
package ArrayListDemo;

import java.util.*;  
public class Ex3{  
 public static void main(String args[]){  
  ArrayList<String> list=new ArrayList(); 
  list.add("pubg");//Adding object in arraylist    
  list.add("freefire");    
  list.add("gun");    
  list.add("bullet");    
  
  
  //Traversing list through for-each loop  
  for(String Action:list)    
    System.out.println(Action);    
  
  System.out.println(list.get(3));
  list.set(2,"bomb");
  
  System.out.println(list);
 }  
}
