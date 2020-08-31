
package GeneralPrograms;

import java.util.Scanner;

public class MovieSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Movie[] obj=new Movie[5];
		for(int i=0;i<4;i++)
		{
			String name=sc.nextLine();
			String company=sc.nextLine();
			String genre=sc.nextLine();
			int bud=sc.nextInt();
			sc.nextLine();
			obj[i]=new Movie(name, company, genre, bud);
			
		}
		String act=sc.nextLine();
		Search(act, obj);
		

	
	}
	public static void Search(String act1, Movie[] obj)
	{
                    if(movie.budget >="80cr")
                    {
                        System.out.println("");
                    }
                    else
                    
	}

}

class Movie{
	String movieName ;
	String Company ;
	String Genre ;
	int budget;
	public Movie(String movieName, String company, String genre, int budget) {
		super();
		this.movieName = movieName;
		Company = company;
		Genre = genre;
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
	public void setCompany(String company) {
		Company = company;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
}

