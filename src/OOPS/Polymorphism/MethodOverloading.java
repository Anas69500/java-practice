
/*
This code is for taking User full name by using Method Overloading in it
And in Method overloading we have give same method name but different parameter data type or number of parameter
 */
package OOPS.Polymorphism;

//We import package for Scanner class
import java.util.Scanner;

//Create a class
class Student {

    //Here we take two parameter in method
    public String Add(String first, String last) {
        //we Concatenate this two parameter
        return first + " " + last;
    }

    //Here we take same method name and different number of parameter
    public String Add(String first, String middle, String last) {
        //we Concatenate this three parameter
        return first + " " + middle + " " + last;
    }

}

public class MethodOverloading {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//Here we create Scanner class object to take an input from user

        System.out.print("Enter the First name: ");
        String first = sc.nextLine();//Storing input in variable

        System.out.print("Enter the Middle name: ");
        String middle = sc.nextLine();//Storing input in variable

        System.out.print("Enter the Last name: ");
        String last = sc.nextLine();//Storing input in variable

        Student s = new Student();//create an object of Student class

        String name;

        if (middle.trim().isEmpty()) {//Here we check if user enter empty
            //then calls two parameter method and store in name variable
            name = s.Add(first, last);
        } else {
            //else calls three parameter method ad store in name variable
            name = s.Add(first, middle, last);
        }

        //print full name of user
        System.out.println("The Full Name is : " + name);


    }
}
