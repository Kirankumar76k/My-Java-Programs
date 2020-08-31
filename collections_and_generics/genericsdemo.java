
package collections_and_generics;

 class container<T extends Number>
 {
     T value ;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
     public void show()
     {
         System.out.println(value.getClass());
     }
 }


public class genericsdemo {
    public static void main(String[] args) {
        container<Float> obj=new container();
        obj.value=9.6f;
        obj.show();
    }
}
