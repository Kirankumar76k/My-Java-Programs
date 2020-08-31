
package Variables;

public class Local {
    public void dummy()
    {
        int a=10,b=20,c;
        c=a+b;
        System.out.println("addition of two numbers "+c);
    }
    public static void main(String[] args) {
        Local obj=new Local();
        obj.dummy();
        
    }
}
