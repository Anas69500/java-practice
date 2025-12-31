package OOPS.Inheritance;

/*
It's a Hybrid Inheritance code in this inheritance we use 2 combination or more inheritance type in it
like we use Multilevel and Multiple inheritance
 */

class D extends Kitten implements A, B { //Here we use extends and implements key in class
    //method from interface A
    public void displayA() {
        System.out.println("Parent A\n");
    }

    //method from interface B from other file
    public void displayB() {
        System.out.println("Parent B\n");
    }
}

public class Hybrid {
    public static void main() {
        D d = new D(); //Initialize object of class d
        d.Show();
        d.Meow();
        d.KMeow();
        d.displayA();
        d.displayB();
    }
}
