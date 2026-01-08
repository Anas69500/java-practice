package JCFPractice.SET;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetPractice {
    public static void main(String[] args){
        Set<Integer> se = new HashSet<>();
        se.add(20);
        se.add(10);
        se.add(50);
        se.add(30);
        se.add(null);

        System.out.println(se);
        System.out.println(se.hashCode());
    }
}
