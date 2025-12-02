import java.util.*;

public class calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            //Detail of Calculator how to perform operation 
            System.out.println("Your using a Calculater, please select operator and enter numbers !!!!!!!");
            System.out.println("Enter '1' for Addition ( + )");
            System.out.println("Enter '2' for Subtraction ( - )");
            System.out.println("Enter '3' for Multiplication ( * )");
            System.out.println("Enter '4' for Division ( / )");
            System.out.println("Enter '5' for Quit \n");

            //Take input function from package
            

            //Enter the operator
            System.out.print("Select a operation to perform: ");
            int b = sc.nextInt();
            
            //checking if user select Quit
            if (b == 5){
                System.out.println("Exit");
                // sc.close();
                break;
            }

            //Enter the first number
            System.out.print("Enter the First number ");
            int a = sc.nextInt();

            //Enter the Second number
            System.out.print("Enter the Second number: ");
            int c = sc.nextInt();

            //checking what user select operation to perfrom
            if (b == 1) {
                int sum = a + c; 
                System.out.println("\n A Addition of two number is: " + sum + "\n" );
            } else if (b == 2) {
                int sum = a - c;
                System.out.println("\n A Subtraction of two number is: " + sum + "\n");
            } else if (b == 3){
                int sum = a * c;
                System.out.println("\n A Multiplication of two number is: " + sum + "\n");
            } else if (b == 4){
                int sum = a / c;
                System.out.println("\n A Division of two number is: " + sum + "\n");
            } else {
                System.out.println("\n Please inter valid input" + "\n");
            }
        }
        sc.close();
    }
    
}
