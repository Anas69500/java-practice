package DSAPractice.Recursion;


public class firstRecursion {
    static void practice(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        practice(n-1);
    }
    public static void main(String[] args){
        practice(5);
    }
}
