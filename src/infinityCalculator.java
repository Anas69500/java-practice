import java.util.Scanner;

public class infinityCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0.0;
        boolean firstinput = true;

        while (true) {
            
            if (firstinput) {
                System.out.print("Enter the First input: ");
                result = sc.nextDouble();
                firstinput = false;
            }

            System.out.print("Enter the operaton ( +, - , * , / , Q , R) Q for Quit and R for result: ");
            String opera = sc.next();

            if (opera.equalsIgnoreCase("Q")) {
                System.out.println("You Quit the Calculator!");
                break;
            } else if (opera.equalsIgnoreCase("R")){
                System.out.println("Result is:" + result);
            }

            System.out.print("Enter the next number: ");
            double nextinput = sc.nextDouble();

            switch (opera) {
                case "+":
                    result += nextinput;
                    break;
                case "-":
                    result -= nextinput;
                    break;
                case "*":
                    result *= nextinput;
                    break;
                case "/":
                    if (nextinput != 0) 
                        result /= nextinput;    
                    else 
                        System.out.println("Error: Divison by zero.");
                        break;
            
                default:
                System.out.println("Invalid input! try again.");
                    continue;
            }
        }
        sc.close();
    }
}
