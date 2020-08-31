
package InstanceBlock;


public class Instance1 {
 public void Instance1()
           {
            System.out.println("constructor method");
           }
 {
     int a=20;
    int  b=2;
     System.out.println((a+b)+"instance block"+(a+b));
 }
 static
 {
     System.out.println("static block");//.static block will exectued only one time bcuz it allocates at class area
 }}
class A extends Instance1{
     String Color="blue";
     A(){
         super();
         System.out.println("A constructor method"+Color);
         }
     A(String Color){
         this.Color=Color;
         System.out.println("value is"+Color);
     }
     

    public static void main(String[] args) {
        Instance1 obj = new Instance1();
        A obj1 = new A();
        A obj2 = new A("kiran");
    }
}
