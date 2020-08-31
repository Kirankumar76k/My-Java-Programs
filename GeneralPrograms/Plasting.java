  
package GeneralPrograms;

public class Plasting {

    public static void main(String[] args) {
     Student obj1 =new Student(1,"kiran");
     Student obj2 =new Student(2,"somu");
     String name2= new String ("DataFlair");
        System.out.println(name2.toString());
     obj1.display();
     
     obj2.display();
     if(obj1.getId()==1)
     {
         obj1.setName("banagr");
     }
        System.out.println("After updating");
      obj1.display();
    }
}
    