
package GeneralPrograms;

public class Example {
    int a;
    String b="kiran";
   static String c="Somu";
   Example()
   {
       System.out.println("Example class Constructor");
   }
   void dis(){
       System.out.println(" super class normal method");
   }
   public static void read(){
       System.out.println(" static read method");
   }
    public static void main(String[] args) {
        Example obj=new Example();
        //we can call the static method through class or individual because static belongs to class
        read();
        Example.read();
    }
}
