package StringPractice;

import java.util.Scanner;

public class CheckLargestWord {
    public static void main(String[] args){
        //create an object of Scanner class
        Scanner s = new Scanner(System.in);

        //taking an input from user
        String str = s.nextLine();

        String lstr = "";
        String cstr = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c != ' ') {
                cstr += c;

            } else {
                if (cstr.length() > lstr.length()){
                    lstr = cstr;
                }
                cstr = "";
            }

            if (cstr.length() > lstr.length()) {
                lstr = cstr;
            }


        }

        System.out.println("largest word: " + lstr + "\nlength : " + lstr.length());
    }
}
