package Arrays;

import java.util.Scanner;

public class DeletingElement {

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
        System.out.println("enter element do you want to delete");
        int temp = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (temp == a[i]) {
                flag = 1;
                loc = i;
                break;
            } else {
                flag = 0;
            }
        }
        if (flag == 1) {
            for (int i = loc + 1; i < size; i++) {
                a[i - 1] = a[i];
            }
            System.out.println("after deleting");
            for (int i = 0; i <= size - 2; i++) {
                System.out.println(a[i]);
            }

        } else {
            System.out.println("element not found");
        }

    }
}
