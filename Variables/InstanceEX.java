
package Variables;

public class InstanceEX {
    int english;
    int math;
    int tel;
    public static void main(String[] args) {
        InstanceEX obj =new InstanceEX();
        obj.english=40;
        obj.tel=92;
        obj.math=45;
        InstanceEX obj1 =new InstanceEX();
        obj1.english=90;
        obj1.tel=82;
        obj1.math=65;
        System.out.println("first student marks");
        System.out.println("english "+obj.english);
        System.out.println("Telugu "+obj.tel);
        System.out.println("Maths "+obj.math);
        System.out.println("second student marks");
        System.out.println("english "+obj1.english);
        System.out.println("Telugu "+obj1.tel);
        System.out.println("Maths "+obj1.math);
    }
}