
package Abstract;

public class AbsDemo2 extends AbstractClass{
        @Override
        public void absDisplay(){
            System.out.println("implented abstract method");
        }
        public static void main(String[] args) {
        AbsDemo2 obj =new AbsDemo2();
        obj.absDisplay();
        obj.display();
    }
}
