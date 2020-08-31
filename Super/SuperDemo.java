//super keyword is a reference variable,which is used to refer immediate parent class object.
//super can be used to invoke immediate parent class method.
//super() can be used to invoke immediate parent class constructor.
package Super;

 class A{
     String a="kiran";
     public void m()
     {
         System.out.println("hello im super class");
     }
 }
     class B extends A
     {
         
      String a="somu";  
      B(){
          System.out.println("im B class");
      }
      B(String a)
      {
          System.out.println("im b instance block"+a);
      }
      static
      {
          System.out.println("im static block of b class");
      }
         public void m()
         {
             System.out.println(" hellooooooo"+super.a);
                          System.out.println(" hellooooooo"+a);
             System.out.println("hello im subclass");
            super.m();
         }
     }

public class SuperDemo {
    public static void main(String[] args) {
    B obj= new B();
    obj.m();
    
}
}