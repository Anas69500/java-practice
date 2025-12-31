package OOPS.Inheritance;

class Sparrow extends Animal{
    void fly() {
        System.out.println("The Sparrow will fly in Air!\n");
    }
}

class Lion extends Animal{
    void walk() {
        System.out.println("The Lion will walk on land!\n");
    }
}

class Fish extends Animal{
    void Swim() {
        System.out.println("The fish will Swim in Water!\n");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Sparrow s = new Sparrow();
        s.Show();
        s.fly();

        Lion l = new Lion();
        l.Show();
        l.walk();

        Fish f  = new Fish();
        f.Show();
        f.Swim();
    }
}
