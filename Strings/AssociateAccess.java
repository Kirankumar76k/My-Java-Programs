package Strings;

import java.util.*;

public class AssociateAccess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Associate[] obj = new Associate[5];
        for (int i = 0; i < obj.length; i++) {
            //System.out.println("enter associate id");
            String id = sc.nextLine();
            //System.out.println("enter associate name");
            String name = sc.nextLine();
            //System.out.println("enter technology");
            String tech = sc.nextLine();
            //System.out.println("enter experience in years");
            int exp = sc.nextInt();
            sc.nextLine();
            obj[i] = new Associate(id, name, tech, exp);
        }
        System.out.println("enter technology");
        String search = sc.nextLine();
        Associate[] h = searchingTech(obj, search);
        for (int i = 0; i < h.length; i++) {
            System.out.println(h[i].getAsid());
        }
    }

    public static Associate[] searchingTech(Associate o[], String s) {
        
        TreeSet<Associate>g=new TreeSet<Associate>();
        int k = 0, count = 0;
        for (int i = 0; i < o.length; i++) {
            if (s.equals(o[i].getTechnology())&&(o[i].getExpinyears() % 5 == 0))
                    {
                    g.add(o[i]);
                    }
            }
        
        for (k = 0; k < g.size()-1; k++) {
            for (int j = 0; j < g.size()- 1; j++) {
                if (Integer.parseInt(g..getAsid()) > Integer.parseInt(g.get(j).getAsid()))
                {
                    Associate temp = g.get(j);
                    g.get(j) = g.get(j+1);
                    g.get(j+1) = temp;
                }
            }
        }
        return g;

    }
}
/*

101
Alex
Java
15
102
Albert
Unix
20
103
Alfred
Testing
13
104
Alfa
Java
15
105
Almas
Java
29

*/