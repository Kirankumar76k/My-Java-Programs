//string tokenizer class in java is used to break  a string into tokens.
package Arrays;

import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class CharDesc {

    public static void main(String[] args) {

        char[] ch = {'l', 'o', 'v', 'e'};
        String s = new String(ch);
        Scanner Sc = new Scanner(System.in);
//        StringTokenizer st= new StringTokenizer(s," ");
//        while(st.hasMoreElements())
//        {
//          String token=st.nextToken();
//            System.out.println(token+"\n");
//            
//        }
       
        char[] c = s.toCharArray();
        TreeSet<Character> h = new TreeSet<Character>();
        Iterator it;
        for (int i = 0; i < c.length; i++) {
            h.add(c[i]);
        }
        it = h.descendingIterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }
    }
}
