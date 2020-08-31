//An array of N integers is passed as input to the program.
//The program must print another array where value at each index will be the 
//sum of the square of all the values in the input array except the value
//at that index in the input array. 
//[Input format: First input refers to the no of elements in the array and the next
//is the series of elements in the array] 
package Arrays;

import java.util.Scanner;

public class DemoArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, sum = 0;
        int k = 0;
        System.out.println("enter a size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] res = new int[5];
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            sum = 0;
            for (j = 0; j < n; j++) {
                if (j == i) {
                    continue;
                } else {
                    sum = sum + (arr[j] * arr[j]);
                }
            }
            res[k++] = sum;
        }
        for (i = 0; i < 5; i++) {
            System.out.println(res[i]);
        }
    }
}
