package JCFPractice.MAP;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapPractice {
    public static void main(String[] args){
        Map<Integer, String> value = new TreeMap<>();
        value.put(99, "Adil");
        value.put(95, "Adnan");
        value.put(92, "Anas");
        value.put(97, "Adil");

        System.out.println(value);
        for (Integer key: value.keySet()){
            System.out.println(key + " : " + value.get(key));
        }
    }
}
