package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {
    public static void main(String[] args) throws IOException {
        try {
            FileReader f = new FileReader("C:\\Users\\anas1\\Desktop\\data.txt");

           try{
               int i;
               while((i = f.read()) != -1){
                   System.out.print((char)i);
               }
           } finally {
               f.close();
               System.out.println("\nfile close successfully....!");
           }

        } catch (FileNotFoundException e) {
            System.out.println("Something went wrong...." + e);
        }
    }
}
