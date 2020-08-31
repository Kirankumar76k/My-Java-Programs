
package Basics;
import java.io.*; 
public class agediff {
    
}

  
class Dod { 
    static void findDiff(int joining_date, int joining_month, 
                    int joining_year, int dis_date, 
                    int dis_month, int dis_year) 
    { 
        int month[] = { 31, 28, 31, 30, 31, 30, 31,  
                             31, 30, 31, 30, 31 }; 
        if (dis_date > joining_date) { 
            joining_month = joining_month - 1; 
            joining_date = joining_date + month[dis_month - 1]; 
        } 
  
        if (dis_month > joining_month) { 
            joining_year = joining_year - 1; 
            joining_month = joining_month + 12; 
        } 
  
        int calculated_date = joining_date - dis_date; 
        int calculated_month = joining_month - dis_month; 
        int calculated_year = joining_year - dis_year; 
  
       
        System.out.println("Present Diff"); 
        System.out.println("Years: " + calculated_year +  
              " Months: " + calculated_month + " Days: " +  
              calculated_date); 
    } 
    public static void main(String[] args) 
    { 
        // present date 
        int joining_date = 7; 
        int joining_month = 12; 
        int joining_year = 2017; 
  
        // birth dd// mm// yyyy 
        int dis_date = 16; 
        int dis_month = 12; 
        int dis_year = 2009; 
  
        // function call to print age 
        findDiff(joining_date, joining_month, joining_year, 
              dis_date, dis_month, dis_year); 
    } 
} 
