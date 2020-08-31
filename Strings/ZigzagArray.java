package Strings;

import java.util.Scanner;

public class ZigzagArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a range to print zigzag array");
        int n = sc.nextInt();
        int f[] = new int[n];
        int temp = 0;
        boolean var = true;
        System.out.println("enter" + n + "elements");
        for (int i = 0; i < n; i++) {
            f[i] = sc.nextInt();
        }
        for (int i = 0; i < f.length-1; i++) {
                if (var == true) {
                    if (f[i] > f[i+1]) {
                        temp = f[i];
                        f[i] = f[i+1];
                        f[i+1] = temp;
                    } 
                }
                    else {
                        if (f[i] < f[i+1]) {
                            temp = f[i];
                            f[i] = f[i+1];
                            f[i+1] = temp;
                        }
                    }
                var=!var;
                }
        
        for(int i=0;i<f.length;i++)
        {
            System.out.println(f[i]);
        }
        }
}
