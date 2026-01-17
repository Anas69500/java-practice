package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileDetail {
    public static void main(String[] args){
        File f = new File("C:\\Users\\anas1\\Desktop\\data.txt");

        try {
            if (f.exists()) {
                System.out.println("FILE Name: " + f.getName());
                System.out.println("FILE Path: " + f.getAbsolutePath());
                System.out.println("FILE Length: " + f.length());
                System.out.println("FILE Can Read: " + f.canRead());
                System.out.println("FILE Can Write: " + f.canWrite());
                System.out.println("FILE Path: " + f.toPath());
//                System.out.println("FILE Delete: " + f.delete());
            } else {
                System.out.println("FILE doesn't exists ?");
            }

        } catch (Exception e) {
            System.out.println("Something went wrong....>>>>?" + e);
        }


    }
}
