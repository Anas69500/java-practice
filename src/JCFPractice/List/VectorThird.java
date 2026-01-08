package JCFPractice.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectorThird {
    public static void main(String[] args){

        List<String> vec = new Vector<>();
        vec.add("Apple");
        vec.add("Banan");
        vec.add("Mango");
        vec.add("Orange");
        vec.add(null);

        System.out.println(vec.get(2));
        System.out.println(vec.set(1, "Banana"));
        System.out.println(vec);
        vec.add(4, "ABC");
        vec.remove(5);
//        vec.remove(1);
        System.out.println(vec);
        System.out.println(vec.contains("Mango"));

        List<String> fruits = new LinkedList<>();
        fruits.add("ABC");
        fruits.add("BCA");
        vec.addAll(fruits);
        System.out.println(vec);



    }
}
