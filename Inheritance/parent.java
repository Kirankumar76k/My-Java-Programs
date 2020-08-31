
package Inheritance;

class ranku {
  public void display()
  {
      System.out.println("parent class");
  }
 
}
class child1 extends ranku
{
    public void display()
  {
      System.out.println("child1 class");
  }
}
class child2 extends ranku
{
    public void display()
  {
      System.out.println("child2 class");
  }
    
}
public class parent
{
    public static void main(String[] args) {
        ranku obj;
        obj=new child1();
        obj=new child2();
        obj.display();
        obj.display();
    }
}