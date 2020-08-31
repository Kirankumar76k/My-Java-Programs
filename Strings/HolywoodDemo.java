
package Strings;

import java.util.Scanner;

public class HolywoodDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Hollywood[] obj=new Hollywood[4];
        for(int i =0;i<obj.length;i++)
        {
            System.out.println("enter movie name");
            String name=sc.nextLine();
            System.out.println("enter company name");
            String comp=sc.nextLine();
            System.out.println("enter genre");
            String gen=sc.nextLine();
            System.out.println("Enter budget");
            int bud=sc.nextInt();
            sc.nextLine();
            obj[i]=new Hollywood(name,comp,gen,bud);
        }
            System.out.println("enter a genre to get a list of that genre movies");
            String search=sc.nextLine();
            getMovieByGenre(obj,search);
           
    }
      public static void getMovieByGenre(Hollywood[] o,String s)
            {
                for(int i=0;i<o.length;i++)
                {
                    if(s.equals(o[i].getGenre()))
                    {
                        System.out.println(o[i].getMovieName());
                    }
                }
            }
}
