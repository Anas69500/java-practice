package FileHandling;
import java.io.File;
import java.io.IOException;
//import java.io.*;

public class first {
    public static void main(String[] args) {

        try {
            File f = new File("C:\\Users\\anas1\\Desktop\\data.txt");
            if(f.createNewFile()){
                System.out.println("File Successfully Created...>>>>");
            } else {
                System.out.println("File already Exist....>>>>");
            }
        } catch (IOException e) {
            System.out.println("Something went wrong....>>>>?" + e);
        }
    }
}
