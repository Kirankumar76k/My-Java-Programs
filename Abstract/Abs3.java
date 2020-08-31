
package Abstract;

public abstract class Abs3 {
    public abstract void first();//declaration 
    public void firstnormal(){
        System.out.println("first class first normal method");
    }
    
}
abstract class Abs4 extends Abs3 {
    public abstract void second();
    public void sec(){
        System.out.println("scond class normal method");
    }
}