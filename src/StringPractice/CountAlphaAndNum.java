package StringPractice;

import java.util.Scanner;

public class CountAlphaAndNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence here to check how many alphabets and number are in it: ");
        String str = sc.nextLine();
        int alpha_Count = 0;

        int num_count = 0;

        for (int i = 0; i < str.length(); i++) {
            char C = str.charAt(i);

            if (C >= 'A' && C <= 'Z' || C >= 'a' && C <= 'z') {
                alpha_Count++;
            } else if (C >= '0' && C <= '9') {
                num_count++;
            }
        }
        System.out.println("The alphabets are : " + alpha_Count + " and numbers are : " + num_count);
    }
}
