package JCFPractice.List;

import java.util.LinkedList;
import java.util.List;

public class LinkedListSecond {
    public static void main(String[] args){

        int i = 0;

        List<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(5);

        list.add(null);

        System.out.println(list.get(2));
        System.out.println(list.set(1,3));
        System.out.println(list.size());
        System.out.println(list);
        try{
            for (int num : list){
                System.out.println(num*2);
                num = num*2;
                list.set(i, num);
                i++;

            }
        } catch (Exception e){
            System.out.println("Something went wrong!!!!?");
        }
        System.out.println(list);
        list.remove(4);

        System.out.println(list);
        List<Integer> fruits = new LinkedList<>();
        fruits.add(4);
        fruits.add(6);
        list.retainAll(fruits);
        System.out.println(list);

    }
}
