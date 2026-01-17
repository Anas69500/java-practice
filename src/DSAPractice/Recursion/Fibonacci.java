package DSAPractice.Recursion;

public class Fibonacci {
    static void practice(int a, int b, int n){
        if (n == 0){
            return;
        }
        int next = a + b;
        System.out.println(next);
         a= b;
         b = next;
         practice(a, b, n-1);



    }
    public static void main(String[] args){
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        practice(0 , 1, 5-2);
    }
}
