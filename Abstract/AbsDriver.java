
package Abstract;

public class AbsDriver extends Abs4{
    @Override
    public void first(){//define chesam
        System.out.println("first abstract method");
    }
    @Override
    public void second(){
        System.out.println("second implemented abstract method");
    }
    
    public static void main(String[] args) {
        AbsDriver obj= new AbsDriver();
        obj.first();
        obj.second();
        obj.sec();
        obj.firstnormal();
    }
}
