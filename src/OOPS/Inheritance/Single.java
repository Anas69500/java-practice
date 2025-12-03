package OOPS.Inheritance;

//Parent Class or Super class
class Animal {
    void Sound() {
        System.out.println("The Animal Sound!");
    }
}

class Puppy extends Animal{ //Child class or Sub class
    void Bark() {
        System.out.println("The Puppy is Barking!");
    } 
}

public class Single {
    public static void main(String[] args) {

        Puppy p = new Puppy(); //create an object
        p.Sound();
        p.Bark();
    }
}
