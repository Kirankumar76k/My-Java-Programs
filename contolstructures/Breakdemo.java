/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contolstructures;

/**
 *
 * @author user
 */
public class Breakdemo {
    public static void main(String[] args) {
        System.out.println("print 8 even numbers only");
        int count = 0;
        int i = 0;
        while (true) {
            if (count == 8) {
                break;
            }
            System.out.println(i += 2);
            count++;
        }

    }
}


