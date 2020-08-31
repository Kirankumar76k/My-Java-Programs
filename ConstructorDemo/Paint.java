//constructor is a block of code similar to the  method
//It is called when the instances is created.when calling a constructor memory for the object
//is allocated to the memory.
//it is used to intialize the object.
//when object is created using new() keyword,at least one constructor is called.
//java compiler provides a default constructor by default.
//constructor must have no explicit return type
package ConstructorDemo;

public class Paint {
    Paint(){
        System.out.println("New Painting has been Drawn");
    }
    public static void main(String[] args) {
        Paint obj =new Paint();
       
    }
}