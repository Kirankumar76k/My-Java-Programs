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
public class ReturnDemo {
        public int add(int a,int b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        ReturnDemo obj=new ReturnDemo();
        System.out.println(obj.add(2,3));//5
    }
    

}
