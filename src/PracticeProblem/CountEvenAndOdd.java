package PracticeProblem;

import java.util.Scanner;

public class CountEvenAndOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int var = sc.nextInt();

        String str= Integer.toString(var);

        int odd = 0;
        int even = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("The count of Even is: " + even + " And odd is: " + odd);
    }
}
