
package Arrays;

import java.util.Scanner;

class Account{
    private int number;
    private String  acType;
    private double balance;
    //private int noOfAcHold;
    public Account(int number, String acType, double balance )
    {
        this.number=number;
        this.acType=acType;
        this.balance=balance;
//        this.noOfAcHold=noOfAcHold;
    }
    public  void setNumber (int number)
    {
        this.number=number;
    }
    public int getNumber()
    {
        return number;
    }

    public String getAcType() {
        return acType;
    }

    public void setAcType(String acType) {
        this.acType = acType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

//    public int getNoOfAcHold() {
//        return noOfAcHold;
//    }
//
//    public void setNoOfAcHold(int noOfAcHold) {
//        this.noOfAcHold = noOfAcHold;
//    }
    
    
}
public class AccountDemo {
      static int searchAccByNum(Account[] ob, int n)
        {
            int i;
            int flag=0;
            for(i=0;i<3;i++)
            {
               if(ob[i].getNumber()==n)
               {
                   flag=1;
                   break;
               }
            }
            if(flag==1)
                return i+1;
            else return -1;
            
        }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Account obj[]= new Account[3];
        for(int i=0;i<obj.length;i++)
        {
            System.out.println("enter acc number");
            int a=sc.nextInt();
            sc.nextLine();
            
            System.out.println("enter acc type");
            String b=sc.nextLine();
            System.out.println("enter a balance");
            double c=sc.nextInt();
            
            obj[i]=new Account(a,b,c);
        }
        System.out.println("enter acc num to search");
        int s=sc.nextInt();
        System.out.println(searchAccByNum(obj,s));
      
    }
}
