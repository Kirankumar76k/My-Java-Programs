package Strings;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter no of products");
        n = sc.nextInt();
        Items obj[] = new Items[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter item name");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.println("enter item price");
            int price = sc.nextInt();
            System.out.println("enter discount for item");
            int discount = sc.nextInt();
            obj[i] = new Items(name, price, discount);
        }

        String h = discount(obj);
        System.out.println(h);
    }

    static String discount(Items obj[]) {
        String res = null;
        float rate[] = new float[4];
        int k = 0;
        for (int i = 0; i < 4; i++) {
            rate[k++] = (obj[i].price / 100) * obj[i].discount;
        }
        float hr = rate[0];
        for (int i = 0; i < rate.length; i++) {
            if (rate[i] < hr) {
                hr = rate[i];
                res = obj[i].getName();
            }
            
        }
        return res;
    }
}
 