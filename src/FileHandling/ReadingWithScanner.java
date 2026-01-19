package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingWithScanner {
    public static void main(String[] args){
        try {
            Scanner read = new Scanner(new File("C:\\Users\\anas1\\Desktop\\data.txt"));

                while(read.hasNextLine()){
                    System.out.println(read.nextLine());
                }
                System.out.println("Successfully print all lines..!");
                
        } catch (FileNotFoundException e) {
            System.out.println("File not found....!");
        }
    }
}
