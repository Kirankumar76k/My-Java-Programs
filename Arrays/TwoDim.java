
package Arrays;

public class TwoDim {
    public static void main(String[] args) {
        int[][] d={
            {1,2,3,4},
            {22,3,22,1},
            {90,34,6,12}
        };
        for(int i=0;i<d.length;i++)//jagged arrays
        {
            for(int j=0;j<d[i].length;j++)
            {
                System.out.print("  "+d[i][j]);
            }
            System.out.println(" ");
        }
      
        }
}
