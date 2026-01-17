package FileHandling;
import java.io.File;
import java.io.IOException;

public class FileRename {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\anas1\\Desktop\\data.txt");
        File r = new File("C:\\Users\\anas1\\Desktop\\mydata.txt");

        if(f.exists()){
            System.out.println("File found...");

            if(f.renameTo(r)){
                System.out.println("File rename Successfully....");
            } else {
                System.out.println("File rename unsuccessful...!");
            }
        } else {
            System.out.println("File not found....!");
        }
    }
}
