package Strings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class LeastOffer {

    String name;
    int price;
    int discount;

    public LeastOffer(String name, int price, int discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LeastOffer obj[] = new LeastOffer[4];
        System.out.println("enter item name, price and percentage");

        for (int i = 0; i < 4; i++) {
            String ls = sc.nextLine();
            StringTokenizer token = new StringTokenizer(ls, ",");
            String a = token.nextToken();
            int b = Integer.parseInt(token.nextToken());
            int c = Integer.parseInt(token.nextToken());
            obj[i] = new LeastOffer(a, b, c);
        }
        LeastOffer a = discount(obj);
        System.out.println(a.name+" "+a.discount+" "+a.price);
    }

    static LeastOffer discount(LeastOffer obj[]) {
        String res = null;
        LeastOffer v= null;
        int pp=0;
        float rate[] = new float[4];
        int k = 0;
        for (int i = 0; i < 4; i++) {
            rate[k++] = (obj[i].getPrice() / 100) * obj[i].getDiscount();
        }
        float hr = rate[0];
        for (int i = 0; i < obj.length; i++) {
            if (rate[i] < hr) {
                hr = rate[i];
                v=obj[i];
            }
        }
        return v;

    }
}
