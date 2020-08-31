//cpsg-->        [class]    [package]  [subclass]    [global] or (outside the package)
//public-->         yes         yes            yes              yes
//protected-->    yes         yes            yes              no
//default-->        yes         yes            no               no
//private-->        yes         no             no               no

//access modifiers in java specifies the accessibility or scope of field,method,constructor or class 
//we can change the access level of fields,method, constructor and class by applying access modifiers



                                         //private access modifier example
package AccessModifiers;
class A {
    
    private int d;
    private void display2()
    {
        System.out.println("this is private method");
    }
}
   public class AccessDemo{
    public static void main(String[] args) {
        A obj = new A();
        //we are accessing these private members from outside the class so it shows compile time error
        //System.out.println(obj.d);
        //obj.display2();
             
    }
}
