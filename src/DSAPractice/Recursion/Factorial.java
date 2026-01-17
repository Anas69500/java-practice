package DSAPractice.Recursion;

public class Factorial {
    static int practice(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int add = practice(n-1);
        int total = n * add;
        return total;
    }
        public static void main(String[] args){
            int ans = practice(7);
            System.out.println(ans);
//            practice(7);
        }

}
