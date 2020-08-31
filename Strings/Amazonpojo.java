
package Strings;

public class Amazonpojo {
    private String empname;
    private float salary;
    private int age;

    public Amazonpojo(String empname, float salary, int age) {
        this.empname = empname;
        this.salary = salary;
        this.age = age;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
