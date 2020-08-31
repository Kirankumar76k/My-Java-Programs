//An Array is a container that can holds data(values) of one single type
//for eg: you can create an array that can hold 100 values of int type
// dataType[] = arrayName; declaring an array
//dataType can be Primitive data type like; int,char,float,double,byte etc.,  or an object.
//arrayName is a identifier.
//allocating memory for array elements
//data = new double[5];
//its possible to declare and allocate memory of an array in one statement.it can replace two statements with a single statement
//int[] age= new int[10];
package Arrays;

public class AAfirst {
    public static void main(String[] args) {
        int[] age = new int[2];//we allocate the size of an array
        age[0]=3;
        age[1]=4;
        System.out.println(age[1]);
        int[] j= {10,150,366,44,88};//instead of assigning values directly 
        for (int i=1;i<5;i++)
        {
        System.out.println(j[i]);
        }
    }
    
}
