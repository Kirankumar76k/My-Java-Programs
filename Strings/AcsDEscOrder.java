//package Strings;
//
//import java.util.Scanner;
//
//public class AcsDEscOrder {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a string");
//        String s = sc.nextLine();
//        char[] c = s.toCharArray();
//        int k = 0;
//        for (int i = 0; i < c.length / 2; i++) {
//            for (int j = i + 1; j < c.length / 2; j++) {
//                if (c[i] < c[j]) {
//                    char temp = c[i];
//                    c[i] = c[j];
//                    c[j] = temp;
//                }
//            }
//            System.out.println(c[i]);
//            k = i;
//        }
//
//        for (int b = k; b < (c.length); b++) {
//            for (int m = k + 1; m < (c.length); m++) {
//                if (c[b] > c[m]) {
//                    char temp = c[b];
//                    c[b] = c[m];
//                    c[m] = temp;
//                }
//            }
//            System.out.println(c[b]);
//        }
//    }
//
//}
import static java.lang.Math.ceil;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class AcsDEscOrder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        int i = 0;
        for(i = 0; i < ceil(c.length/2); i++) {
            for(int j = 0;j<(c.length/2)-1;j++) {
                if (c[j] < c[j+1]) {
                    char temp = c[j+1];
                    c[j+1] = c[j];
                    c[j] = temp;
                }
            }
        }

        for (int b = i; b < c.length; b++) {
            for (int m = i; m < (c.length-1); m++) {
                if (c[m] > c[m+1]) {
                    char temp = c[m+1];
                    c[m+1] = c[m];
                    c[m] = temp;
                }
            }
//            System.out.println(c[b]);
        }
        for(int k=0;k<c.length;k++)
        {
            System.out.print(c[k]);
        }
    }

}