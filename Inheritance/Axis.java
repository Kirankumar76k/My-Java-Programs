package Inheritance;

class Bank {

    int a, b;

    public float rate() {
        return 0;
    }
}

class Sbi extends Bank {

    public float rate() {
        // System.out.println("1.2 vachinde");
        return 1.2f;
    }
}

public class Axis extends Sbi {

    public float rate() {
        System.out.println(super.rate());
        return 2.5f;
    }

    public static void main(String[] args) {
        Axis obj = new Axis();
        System.out.println(obj.rate());
    }

//    public Axis() {
//        super();
}
