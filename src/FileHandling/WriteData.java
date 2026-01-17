package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
    public static void main(String[] args){
        try {
            FileWriter f = new FileWriter("C:\\Users\\anas1\\Desktop\\data.txt");
            try{
                f.write("My first sentence with File Writer class \n");
                f.write("My first sentence with File Writer class\n");

                f.append("Here my second line in");
                System.out.println("Successfully wrote data in file.....");
            }
            finally {
                f.close();
            }
        } catch (IOException e) {
            System.out.println("Something went wrong.....");
        }

    }
}
