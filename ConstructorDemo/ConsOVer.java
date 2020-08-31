
package ConstructorDemo;

class Student2{
    int rollno,x,y;
    String name;
    Student2(int a,String b)
    {
        rollno=a;
        name=b;
    }
    Student2(int a, int b){
        x=a;
        y=b;
    }
    public void dis(){
        System.out.println(rollno+""+name);
    }
   public int add(){
        return(x+y);
    }
}
public class ConsOVer {
    public static void main(String[] args) {
    Student2 obj = new Student2(1,"kiran");
    Student2 obj1 = new Student2(2,9);
    obj.dis();
    System.out.println(obj1.add());
}}
