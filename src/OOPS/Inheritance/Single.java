//              ___  *
//             |                   |
//             |___  | |___  ____  |     ___
//                 | | |   ||    | |    |---|       Inheritance
//              ___| | |   ||____| |___ |__
//                               |
//                           |___|

package OOPS.Inheritance;

//create a class with Animal name
class Animal {
    //create method
    void Show() {
        //printing an output
        System.out.println("The Animal!");
    }
}
//Here we inherit Animal class in Puppy class
class Puppy extends Animal {
    //create another method
    void Bark() {
        //print an output
        System.out.println("The Puppy is Barking!");
    }
}

public class Single {
    public static void main(String[] args) {
        //create an object of Puppy class
        Puppy p = new Puppy();
        p.Show();//calling method show of Puppy that inherits show method from Animal class
        p.Bark();//calling method of Puppy class
    }
}
