package ExceptionHandling;

public class ThrowPractice {
    public static void main(String[] args){
        int a = 21;
        int b = 0;

        try {
            b = 20/a;
            if (b == 0){
                throw new ArithmeticException("we can't print zero");
            }
        } catch (ArithmeticException e) {
            b = 20/1;
            System.out.println("This is a default value " + e);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        System.out.println(b);
        System.out.println("bye");
    }
}
