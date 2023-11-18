package in.gfg.day3;

import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {
        CollectionDemo c1 = new CollectionDemo();
        c1.method1();
    }

    public void method1() {
        //HashMap<Object, Object> m1 = new HashMap<Object, Object>();

        //HashMap m2 = new HashMap();

        //HashMap<String, String> m3 = new HashMap<String, String>();
        Map<String, String> m4 = new HashMap<String, String>();

        m4.put("A1", "Akhil Jain");
        System.out.println(m4.get("A1"));

        List<String> l1 = new ArrayList<String>();

        l1.add("Akhil");
        l1.add("Jain");

        Iterator<String> i1 = l1.iterator();

        while (i1.hasNext()) {
            System.out.println(i1.next().toString());
        }

        //List<int> l2 = new ArrayList<int>();/

        int a1 = 5; //convert this to object
        Integer it1 = new Integer(a1);  //Boxing


        Integer it2 = 6;  //AutoBoxing

        System.out.println(it1.intValue()); //Unboxing

        Set<Integer> s1 = new HashSet<Integer>();

        s1.add(10); //AutoBoxing

        s1.add(new Integer(10)); //Boxing




    }
}
