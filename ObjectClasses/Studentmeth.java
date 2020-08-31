
package ObjectClasses;
 class Student {
    int rollno;
    String name;
   public void insertData( int r , String n)
   {
       rollno=r;
       name=n;
   }
   void displayData(){
       System.out.println(rollno+" "+name);
   }
}
public class Studentmeth{
    public static void main(String[] args) {
        Student st1= new Student();
        Student st2= new Student();
        st1.insertData(1, "kirankumar");
        st2.insertData(9,"somu");
        st1.displayData();
        st2.displayData();
//here s1 and s2 are reference variables in refers the object in heap memory area that allocated in memory
    
    }
}
