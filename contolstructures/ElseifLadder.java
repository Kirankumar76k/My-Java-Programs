
package contolstructures;

public class ElseifLadder {
        public static void main(String[] args) {
        int a=5;
        int b=16;
        int c=8;
        if(a>b&&a>c)
        {
            System.out.println(a+" is big");
        }
        else if(b>a&&b>c)
        {
            System.out.println(b+" is big");
        }
        else{
            System.out.println(c+" is big" );
        }
    }
    
}


