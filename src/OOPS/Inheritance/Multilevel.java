/*
It's a Multilevel inheritance
 */


package OOPS.Inheritance;

class Cat extends Animal {
    void Meow () {
        System.out.println("The Cat is Meowing!");
    }
}

class Kitten extends Cat{
    void KMeow() {
        System.out.println("The Kitten is Meowing!");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Kitten k = new Kitten();
        k.Show();
        k.Meow();
        k.KMeow();
    }
}
