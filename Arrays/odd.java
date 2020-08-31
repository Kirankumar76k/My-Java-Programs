package Arrays;

import java.util.Scanner;

public class odd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rev=0,op = 0, k = 0;
        System.out.println("enter a size of an array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int res[] = new int[size];
        System.out.println("enter the array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                if ((arr[i] >= 1) && (arr[i] <= 9)) {
                    op = 1;
                    if (arr[i] % 2 != 0) {
                                rev=rev*10+(arr[i]);
                        }
                }
            }
            if (op ==0) {
                System.out.println("single digit number is not found");
            }
        } else {
            System.out.println("invalid array size");
        }
        System.out.println(rev);
    }
}
