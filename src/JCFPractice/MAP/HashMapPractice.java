package JCFPractice.MAP;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args){
        Map<String, Integer> value = new HashMap<>();
        value.put("Abdul",20);
        value.put("Reyan",10);
        value.put("Asim",50);
        value.put("Adnan",40);
        value.put("Adil",30);

        System.out.println(value.keySet());
        for (String name: value.keySet()){
            System.out.println(name + " : " + value.get(name));
        }
    }
}
