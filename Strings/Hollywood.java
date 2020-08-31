
package Strings;

public class Hollywood {
   private String movieName ;
   private String Company; 
   private String  Genre;
   private int  budget; 

    public Hollywood(String movieName, String Company, String Genre, int budget) {
        this.movieName = movieName;
        this.Company = Company;
        this.Genre = Genre;
        this.budget = budget;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
    
}
