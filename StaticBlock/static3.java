
package StaticBlock;
public class static3 {
    static int a=10,b=20;
    //when we want to start an execution  of instance method we must to create an object to call the instance method
    //static method dont need to create an object simply we call the method with class[class.staticmethod();]. so it saves memory.
    //static block will executed without creation of an object
    static{
        System.out.println(a+b);
            }
    public static void main(String[] args) {
        
    }
}
