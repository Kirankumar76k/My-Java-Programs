//object:-object is a entity that has a state and behaviour and it is instance(result) of class
//new keyword is used to allocate the memory at a runtime.
//all objects gets memory in heap memory area.
package ObjectClasses;

public class Obj1 {
   //fields or data members or instance variables
     int i;
     String name;
    //creating a  main method inside the class
    public static void main(String[] args) {
        //creating an object or instance
        Obj1 oj= new Obj1(); //creating an object for class
        //printin the values of the object
        System.out.println(" id"+oj.i);// accessing members through reference
        System.out.println(" name is"+oj.name);
    }
}
