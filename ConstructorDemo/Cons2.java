
package ConstructorDemo;

public class Cons2 {
    int roll;
    String name;
    public Cons2(int i, String n){
        roll=i;
        name=n;
    }
    public void display()
    {
        System.out.println(roll+""+name);
    }
    public static void main(String[] args) {
        Cons2 obj = new Cons2(1,"name");

            Cons2 obj2 = new Cons2(2,"kiran");
        obj.display();
                obj2.display();
    }
}
