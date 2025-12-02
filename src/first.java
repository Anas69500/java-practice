public class first {
    public static void main (String[] args) {
        // System.out.println("Hello World");
        // // output
        // System.out.print("h\t*");
        int a = 20;
        int b = 10;
        int sum = (a * b) / (a - b);
        int count = a * b / a - b;
        int c = ++a;
        int d = --b;
        System.out.println("total of a and b: " +sum);
        System.out.println("total of a and b: " +count);
        System.out.println("increment of a: " +c);
        System.out.print("decrement of b: " +d);
    }
}