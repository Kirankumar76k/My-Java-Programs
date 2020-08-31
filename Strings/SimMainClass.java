
package Strings;

import java.util.Scanner;

public class SimMainClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Sim[] obj=new Sim[3];
        for(int i=0;i<obj.length;i++)
        {
            //System.out.println("enter a "+(i+1)+" sim id");
            int id=sc.nextInt();
            sc.nextLine();
            //System.out.println("enter a "+(i+1)+" sim name");
            String na=sc.nextLine();
            //System.out.println("enter a balance");
            int bal=sc.nextInt();
            //System.out.println("enter rate per second");
            double rate=sc.nextDouble();
            sc.nextLine();
            //System.out.println("enter circle");
            String cir=sc.nextLine();
            obj[i]=new Sim(id,na,bal,rate,cir);
        }
        System.out.println("Enter a circle");
        String c=sc.nextLine();
        System.out.println("Enter a rate per second");
        double r=sc.nextDouble();
        Sim s[]=find(obj,c,r);
       // int i[]={1,4,7,9};
       for(int i=0;i<s.length;i++)
       {
           System.out.println(s[i].getSimid());
       }   
    }
    
    public static Sim[] find(Sim sim[],String circle,double rate)
    {
      Sim[] arr;
        int k=0,count=0;
        //double temp=0;
                for(int i=0;i<sim.length;i++)
        {
            if(sim[i].getCircle().equals(circle)&&sim[i].getRatepersecond()>=rate)
            {     
                count++;
            }
        }
                arr=new Sim[count];
        for(int i=0;i<sim.length;i++)
        {
            if(sim[i].getCircle().equals(circle)&&sim[i].getRatepersecond()>=rate)
            {
                arr[k++]=sim[i]; 
            }
        } 
        for(k=0;k<arr.length;k++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j].getBalance()<arr[j+1].getBalance())
                {
                    Sim temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
}
}
