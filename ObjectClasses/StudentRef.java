
package ObjectClasses;

class Student1 {
    int rollno;
    String name;
}
public class StudentRef {
    public static void main(String[] args) {
        Student1 obj= new Student1();
        obj.rollno=12;
        obj.name="helloo";
        System.out.println(obj.rollno+""+obj.name);
    }
}


