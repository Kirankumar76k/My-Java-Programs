//string is a sequence of characters.
//string is an object that represents sequence of char values.
//An array of characters works same as java string.
//Basically strings can be created with two methods
//By string literal,by new keyword
package Strings;

public class RevOfStr {
    public static void main(String[] args) {
        String s="hello kiran welcome to strings";
        String[] str=s.split(" ");
        for( String temp: str)
        {
            System.out.println(temp);
        }
        for (int i=0; i<5;i++)
        {
            char[] k=str[i].toCharArray();
            for(int j=k.length-1;j>=0;j--)
            {
                System.out.print(k[j]);
            }
            System.out.print(" ");
        }
    }
}
