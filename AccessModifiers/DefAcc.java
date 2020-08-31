package AccessModifiers;

class C{
    protected void msg()
    {
        System.out.println("C METHOD");//compile time error
    }
}
public class DefAcc extends C{
    void msg()
    {
        System.out.println(" Def method");
    }
    public static void main(String[] args) {
        DefAcc s=new DefAcc();
        s.msg();//The default modifier is more restrictive than protected. That is why, there is a compile-time error.


    }
}
