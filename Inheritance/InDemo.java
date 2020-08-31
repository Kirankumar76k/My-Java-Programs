//inheritance is a mechanism which one object acquiers  all the properies and behaviour of an
//parent object.
//you can reuse methods and fields of the parent class.
//it is used for code reusability
package Inheritance;
class GrandFather
{
    String crops;
    String Fields;
    public void Assets(){
        System.out.println("i have fields and crops");
    }
            
}
class Father extends GrandFather
{
    String Buildings;
    public  void Assets()
    {
        super.Assets();
        System.out.println("  i nave bulid");
    }
}
class Child extends Father{
    String Car="jaguar";
    public void Assets()
    {
        super.Assets();
        System.out.println(" I have a car");
    }
}
    public class InDemo{
    public static void main(String[] args) {
        Child obj = new Child();
                obj.Assets();
    }}



