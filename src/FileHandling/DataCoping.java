package FileHandling;

import java.io.*;

public class DataCoping {
    public static void main(String[] args) {
        try {
            FileInputStream  r = new FileInputStream("C:\\Users\\anas1\\Desktop\\mydata.txt");
            FileOutputStream fo = new FileOutputStream("C:\\Users\\anas1\\Desktop\\data.txt");

            try{
                int i;
                while((i = r.read()) != -1){
                    fo.write((char)i);
                }
                System.out.println("Successfully copied...!");

            } finally {
                fo.close();
                System.out.println("File closed...!");
            }
        } catch (IOException e){
            System.out.println(e);
        }

    }

}
