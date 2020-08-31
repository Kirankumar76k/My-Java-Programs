//generic collection allows you to have only one type of object in a collection.
//Now it is type safe so typecasting is not required at runtime

package ArrayListDemo;

import java.util.ArrayList;


public class Ex1 {
    public static void main(String[] args) {
        ArrayList pppp=new ArrayList();//creating non-generic arraylist 
        
        ArrayList<String> obj=new ArrayList();//we created a generic arraylist
        
// In a generic collection, we specify the type in angular braces. 
//Now ArrayList is forced to have the only specified type of objects in it. 
//If you try to add another type of object, it gives compile time error
        obj.add("Kiran");
        obj.add("somu");
        obj.add("bangar");
        obj.add("mca");
        obj.add("clg");
        System.out.println(obj);//printing arraylist object
    }
}
