
package JavaTricky;

public class Student implements Comparable <Student>{
    private String name;
    private int rno;
    private int age;

    public Student(String name, int rno, int age) {
        this.name = name;
        this.rno = rno;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//    @Override
//    public String toString()
//    {
//        return "Student details ="+name+" "+rno+" "+age;
//    }
    
    @Override
    public int compareTo(Student kkk)
    {
        
        if(this.getAge()>kkk.getAge())
        {
            return 1;
        }
            else
        {
            return -1;
        }
    }
    }
 
