
package GeneralPrograms;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.StringTokenizer;


public class StringTokeniz {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        String name;
//        Scanner sc=new Scanner(System.in);
//        name=sc.nextLine();
//        StringTokenizer obj=new StringTokenizer(name);
//        while(obj.hasMoreTokens())
//        {
//           String o= obj.nextToken();
//           int l=o.length();
//            System.out.println(o.charAt(l-1));
//        }
        byte[] b_arr = {71, 101, 101, 107, 115};
        String s = new String(b_arr, 0,4, "US-ASCII");
        System.out.println(s);
    }
    
}
