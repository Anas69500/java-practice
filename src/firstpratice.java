public class firstpratice {
    public static void main(String[] args) {
        int a = 5;
        // int b = 10;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j < a - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                // System.out.print(" ");
                for (int j2 = 1; j2 <= 1; j2++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
