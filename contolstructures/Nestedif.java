
package contolstructures;

public class Nestedif {
      public static void main(String[] args) {
    int age=18;
    int days=5;
    if(age>=18)
    {
        if(days>=21)
        {
            System.out.println("You can donate blood");
        }
        else
        {
            System.out.println("plzzz come after "+(21-days));
        }
    }
    else
    {
        System.out.println("You should have mimimum 18 years");
    }
   }   
    
}

