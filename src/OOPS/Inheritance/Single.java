package OOPS.Inheritance;

class Animal {
    void Sound() {
        System.out.println("The Animal Sound!");
    }
}

class Puppy extends Animal {
    void Bark() {
        System.out.println("The Puppy is Barking!");
    }
}

public class Single {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.Sound();
        p.Bark();
    }
}
