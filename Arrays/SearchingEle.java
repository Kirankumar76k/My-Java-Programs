
package Arrays;

import java.util.Scanner;

public class SearchingEle {
        public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        int flag = 0, loc = 0;
    System.out.println("enter a size of an array");
    int size = sc.nextInt();
    int a[] = new int[size];
    System.out.println("enter " + size + " elements");
    for (int i = 0; i < size; i++) {
        a[i] = sc.nextInt();
    }
        System.out.println("enter element do you want to search");
        int temp = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (temp == a[i]) {
                loc=1;
                System.out.println("element found");
                break;
            }
        }
            if(loc==0)
            {
                System.out.println("element not found ");
            }
        }
}
