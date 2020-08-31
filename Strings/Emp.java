
package Strings;


public class Emp {
    String Empname;
    int exp;
    int salary;

    public Emp(String Empname, int exp, int salary) {
        this.Empname = Empname;
        this.exp = exp;
        this.salary = salary;
 
    }

    public String getEmpname() {
        return Empname;
    }

    public void setEmpname(String Empname) {
        this.Empname = Empname;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}
