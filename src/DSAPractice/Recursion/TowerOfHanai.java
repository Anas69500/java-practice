package DSAPractice.Recursion;

public class TowerOfHanai {
    static void Practice(int n, String s, String h, String d){
        var count = 0;
        if (n == 1){
            System.out.println("Transfer disk "+n+" from "+ s +" to "+ d);
            count++;
            return;
        }
        count++;
        Practice(n-1, s, d, h);
        System.out.println("Transfer disk "+n+" from "+ s +" to "+ d);
        Practice(n-1,h , s, d);
//        System.out.println(count);
    }
    public static void main(String[] args){
        int n = 5;
        Practice(n,"S","H","D" );


    }
}
