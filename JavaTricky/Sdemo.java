
package JavaTricky;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sdemo {
    public static void main(String[] args) {
        List <Student> obj=new ArrayList();
        obj.add(new Student("kiran",1,664));
        obj.add(new Student("somu",2,19)); 
        obj.add(new Student("bangar",3,93));
        Collections.sort(obj);
        for(Student h: obj)
        {
            System.out.println(h);
        }

    }
}
