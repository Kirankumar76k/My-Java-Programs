
package AccessModifiers;
class B{
     private B(){}
     private void msg()
     {
         System.out.println("hello this is constructor");
     }
}
public class PrivateCons {
    public static void main(String[] args) {
       // B  obj = new B();//compile time error occured
    }
}
