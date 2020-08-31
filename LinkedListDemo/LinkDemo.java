package LinkedListDemo;

import java.util.*;

public class LinkDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s= {"one","two","three"};
        
        LinkedList ll=new LinkedList();
        ll.add(s);
        ll.toArray(s);
        System.out.println(ll);
        ll.add("kiran");
        ll.add("somu");
        ll.addAll(ll);
        System.out.println(ll);
        
        LinkedList ll2=new LinkedList();
        ll2.add("Bangar");
        ll2.add(ll);
        System.out.println(ll2);
        ll2.addAll(ll);
        System.out.println(ll2);
        Iterator itr=ll2.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        ll2.addFirst("Love");
        ll2.addLast("last element");
        ll2.add(2,"second element in third position");
//        itr=ll2.iterator();
//         while(itr.hasNext())
//        {
//        System.out.println(itr.next());
//        }
System.out.println(ll2);
    
    
}}
