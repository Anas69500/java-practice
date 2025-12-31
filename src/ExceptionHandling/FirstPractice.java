package ExceptionHandling;

public class FirstPractice {
    public static void main(String[] args){
        int a = 2;
        int b = 0;
        try {

            b = 10 / a;
        } catch (ArithmeticException e){
            System.out.println("zero cannot be divide");
        }
        System.out.println(b);
    }
}
