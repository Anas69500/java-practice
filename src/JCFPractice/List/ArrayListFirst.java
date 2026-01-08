package JCFPractice.List;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListFirst {
    public static void main(String[] args){

        int i = 0 ;

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(7);
        nums.add(null);

        System.out.println(nums.get(2));
        System.out.println(nums.set(1,2));
        System.out.println(nums.size());
        System.out.println(nums);
        try{
            for (int num : nums){
                System.out.println(num*2);
                num = num*2;
                nums.set(i, num);
                i++;

            }
        } catch (Exception e){
            System.out.println("Something went wrong!!!!?");
        }
        System.out.println(nums);
        nums.remove(4);
        System.out.println(nums);
    }
}
