package ExceptionHandling;

import java.util.Scanner;

public class FinallyPractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        try {
            a = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Enter Invalid input!!! ");
        } finally {
            sc.close();
            System.out.println("Connection close!");
        }


    }
}
