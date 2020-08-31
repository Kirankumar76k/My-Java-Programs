//Abstraction is a process of hiding the implementation details and showing only functionality to the user.
//An abstract class must be declared with an abstract keyword.
//It can have abstract and non-abstract methods.
//It cannot be instantiated.
//It can have constructors and static methods also.
//it must be overridden. an abstract class must be  extended and in a same way abstract method must be overridden.
//A class derived from the abstract class must implement all the those methods that are declared as abstract in the parent class.
package Abstract;

public abstract class AbstractClass {
    final int a=10;
    int b=5;
    public void display(){
        System.out.println("normal method");
    }
    public abstract void absDisplay();
    }
//we cannot create an object for this class,because abstract methods needs to be implemented
