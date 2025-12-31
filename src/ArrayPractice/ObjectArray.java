package ArrayPractice;
import java.util.Scanner;

class Students{
    int roll;
    String name;
    int mark;
}

public class ObjectArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Students: ");
        int num = sc.nextInt();

        Students s[] = new Students[num];

        for (int i = 0; i < s.length; i++) {
            s[i] = new Students();
            System.out.print("Enter Students roll number: ");
            s[i].roll = sc.nextInt();

            sc.nextLine();
            System.out.print("Enter Students name: ");
            s[i].name = sc.nextLine();

            System.out.print("Enter Students mark: ");
            s[i].mark = sc.nextInt();
//
        }

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].roll + " : " + s[i].name + " : " + s[i].mark);
        }
    }
}
