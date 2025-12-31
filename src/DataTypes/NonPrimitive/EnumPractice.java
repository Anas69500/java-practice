package DataTypes.NonPrimitive;

import java.util.Scanner;

enum Days {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

    private final int i;

    Days(int i) {
        this.i = i;
    }

    public int getI(){
        return i;
    }

}

public class EnumPractice {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter One day: ");
        String input = sc.next().toUpperCase();

        try {
            Days d = Days.valueOf(input);

            switch (d){
                case MONDAY:
                    System.out.println("It's Monday : " + d.getI());
                    break;
                case TUESDAY:
                    System.out.println("It's Tuesday : " + d.getI());
                    break;
                case WEDNESDAY:
                    System.out.println("It's Wednesday : " + d.getI());
                    break;
                case THURSDAY:
                    System.out.println("It's Thursday : " + d.getI());
                    break;
                case FRIDAY:
                    System.out.println("It's Friday : " + d.getI());
                    break;
                case SATURDAY:
                    System.out.println("It's Saturday : " + d.getI());
                    break;
                default:
                    System.out.println("It's Sunday : " + d.getI());
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input enter!");
        }
        sc.close();

    }
}
