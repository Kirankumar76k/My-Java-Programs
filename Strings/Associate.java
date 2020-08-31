
package Strings;

public class Associate {
    private String asid;
    private String asname;
    private String technology;
    private int expinyears;

    public Associate(String asid, String asname, String technology, int expinyears) {
        this.asid = asid;
        this.asname = asname;
        this.technology = technology;
        this.expinyears = expinyears;
    }

    public String getAsid() {
        return asid;
    }

    public void setAsid(String asid) {
        this.asid = asid;
    }

    public String getAsname() {
        return asname;
    }

    public void setAsname(String asname) {
        this.asname = asname;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public int getExpinyears() {
        return expinyears;
    }

    public void setExpinyears(int expinyears) {
        this.expinyears = expinyears;
    }
    
}
