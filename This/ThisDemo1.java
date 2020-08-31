//this can be used to refer a current class instance variable
//if the instance variables and formal arguments are different there is no need to use this keyword
//this can be used to invoke current class method (implicitly)
//this() can be used to invoke current class constructor.
//this can be passed as an argument in the method call.
//this can be passed as argument in the constructor call.
//this can be used to return the current class instance from the method
package This;
class Student3{ 
    int roll;//instance variables
    String name;
 public Student3(int roll,String name)//formal arguments
 {
    this.roll=roll;
    this.name=name;
}
 public void display(){
     System.out.println(roll+""+name);
 }
}



public class ThisDemo1 {
    public static void main(String[] args) {
    Student3 obj = new Student3(1,"kiraani");
    Student3 obj2= new Student3(2,"somi");
    obj.display();
    obj2.display();
}
}