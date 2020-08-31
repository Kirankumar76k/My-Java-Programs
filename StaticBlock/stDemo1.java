//Static keyword in java is used for memory management. it makes your program memory efficient
//[ simply it saves memory]
//it can apply for variables,methods,blocks.
//static variable can be used to refer the common property of all objects.
//static variables gets memory only once in  class area at the time of class loading.
package StaticBlock;
 class StaticClass {
    String name;//instance variable
    int rollno=0;
    static int count = 0;//static variable can be used to refer the common property of all objects.
    String n = "Kiran";
    static String college = "miracle";
    
    public StaticClass(String name)//constructor
    {
        this.name = name;
        this.rollno = getValue();
    }

   int getValue() //count is used to set a unique value
   {
        count++;
        return count;

    }

    public void display() {
        System.out.println("Your name=  " + this.name + "rollno    " + this.rollno + "college name    " + college);
    }

    static//static block
    {
        System.out.println("Its a static block");
    }

    public static void change() {
        college = "avanthi";
    }}
public class stDemo1{
    public static void main(String[] args) {
        System.out.println("Main Method");
        StaticClass obj3;
        StaticClass.change();
        StaticClass obj = new StaticClass("rama");//when we creating an object we indirectly calling a constructor
        StaticClass obj1 = new StaticClass("kiran");
        StaticClass obj2 = new StaticClass("somu");

        obj.display();
        obj1.display();
        obj2.display();
    }
}
