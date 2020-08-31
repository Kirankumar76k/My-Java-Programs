package StaticBlock;

public class Static2 {

    static int a = 10, b = 1;
    static int c = a + b;

    {    //instance block is executed whenever the new object is created
        System.out.println("instance");
        System.out.println(c);
    }

    //static block is executed at only once without creating an object
    //Before calling a constructor Static block will be called
    static {
        System.out.println(c);
    }

    public static int show(int a,int b,int c) //static method
    {
        System.out.println("static method");
        return a+b+c;
    }
  

    public static void main(String[] args) {
        Static2 k = new Static2();
        StaticClass k2 = new StaticClass("kiran");
      int d=show(1,2,3);
        System.out.println(d);
        Static2 k3 = new Static2();
    }

}
