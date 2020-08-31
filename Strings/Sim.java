
package Strings;

public class Sim {
    private int simid;
    private String name;
    private double balance;
    private double ratepersecond;
    private String circle;

    public Sim(int simid, String name, double balance, double ratepersecond, String circle) {
        this.simid = simid;
        this.name = name;
        this.balance = balance;
        this.ratepersecond = ratepersecond;
        this.circle = circle;
    }

    public int getSimid() {
        return simid;
    }

    public void setSimid(int simid) {
        this.simid = simid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRatepersecond() {
        return ratepersecond;
    }

    public void setRatepersecond(double ratepersecond) {
        this.ratepersecond = ratepersecond;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }
    
}
