
package JavaTricky;

public class Anonymous {
    int a;
    public void show()
    {
        System.out.println("kiran"+a);
    }
    public static void main(String[] args) {
//        Anonymous obj =new Anonymous();
//        obj.show();
        new Anonymous().show();
        //obj.a=34;
       // obj.show();
    }
}
