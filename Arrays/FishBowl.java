
package Arrays;

import java.util.Scanner;
import java.util.StringTokenizer;

public class FishBowl {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int count=0,k=0,points=0,sum=0;
//        int[] b=new int[5];
//        String[] s=new String[5];
//        for(int i=0;i<s.length;i++)
//        {
//            s[i]=sc.nextLine();
//        }
//        for(int i=0;i<s.length;i++)
//        {
//            System.out.println(s[i]);
//        }
//         for(int i=0;i<s.length;i++)
//        {
//            StringTokenizer st=new StringTokenizer(s[i]," ");
//            while(st.hasMoreElements())
//            {
//                count=0;points=0;
//                String token= st.nextToken();
//                char[] c=token.toCharArray();
//                for(int j=0;j<c.length;j++)
//                {
//                    if((c[i]=='a')||(c[i]=='e')||(c[i]=='i')||(c[i]=='o')||(c[i]=='u'))
//                    {
//                        count++;
//                    }
//                }
//                if(count==1)
//                {
//                    points=0;
//                }
//                else if(count==2)
//                {
//                    points=1;
//                }
//                 else if(count==3)
//                {
//                    points=3;
//                }
//                 else if(count==4)
//                {
//                    points=4;
//                }
//                 else if(count==5)
//                {
//                    points=6;
//                }
//                 else if(count>5)
//                {
//                    points=8;
//                }
//                sum=sum+points;
//                System.out.print(points);
//            }
//            b[k++]=sum;
//            System.out.println("\n"); 
//    }
//         for (int i = 0; i < s.length; i++) 
//         {
//            for(k=0;k<i;k++)
//            {
//                System.out.println(i+" "+k);
//            }
//        }
//}
//}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0,k=0,points=0,sum=0;
        int[] b=new int[5];
        int winer=0;
        String[] s=new String[5];
        for(int i=0;i<s.length;i++)
        {
            s[i]=sc.nextLine();
        }
//        for(int i=0;i<s.length;i++)
//        {
//            System.out.println(s[i]);
//        }
         for(int i=0;i<s.length;i++)
        {
            StringTokenizer st=new StringTokenizer(s[i]);
             sum=0;
            while(st.hasMoreTokens())
            {
                count=0;
                points=0;
                String token= st.nextToken();
                char[] c=token.toCharArray();
                for(int j=0;j<c.length;j++)
                {
                    if((c[j]=='a')||(c[j]=='e')||(c[j]=='i')||(c[j]=='o')||(c[j]=='u')||(c[j]=='A')||(c[j]=='E')||(c[j]=='I')||(c[j]=='O')||(c[j]=='U'))
                    {
                        count++;
                    }
                }
                if(count==1)
                {
                    points=0;
                }
                else if(count==2)
                {
                    points=1;
                }
                 else if(count==3)
                {
                    points=3;
                }
                 else if(count==4)
                {
                    points=4;
                }
                 else if(count==5)
                {
                    points=6;
                }
                 else if(count>5)
                {
                    points=8;
                }
                sum=sum+points;
                System.out.print(points);
            }
            
            b[k++]=sum;
            System.out.println("\n"); 
    }
         for (int i = 0; i < b.length; i++) 
         {
             System.out.println(i+" "+b[i]);
         }
         // for finding max one
         int big=b[0];
          for (int i = 0; i < b.length; i++) 
         {
             if(big<b[i]){
                 big=b[i];
                 winer=i;
             }
         }
          System.out.println("Winner is"+winer+" with "+big+"points");

        }
}