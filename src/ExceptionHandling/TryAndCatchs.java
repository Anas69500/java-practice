package ExceptionHandling;

public class TryAndCatchs {
    public static void main(String[] args){
        int a = 5;
        int b = 0;
        int arr[] = new int[5];
        String str = null;
        try{
            b = 10/a;
            System.out.println(str.length());
            System.out.println(arr[3]);
            System.out.println(arr[5]);
        } catch (ArithmeticException e){
            System.out.println("Cannot divide by Zero!!");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Something went wrong in Array!!");
        }catch (Exception e){
            System.out.println("Something went wrong!!" + e);
        }
        System.out.println(b);
    }
}
