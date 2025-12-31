//It's a Multiple Inheritance an is not support in java, but we use it through interface
//we can inherit it with implements keyword
//And it child class can inherit more than one parent class
//where a class can implements multiple interfaces

package OOPS.Inheritance;

//create a interface and it's same as class
interface A {
    void displayA() ; //create method
}

//create another interface
interface B {
    void displayB() ;
}

//class c is achieving multiple inherotance
class C implements A, B {
    //method from interface A
    public void displayA() {
        System.out.println("Parent A");
    }

    //method from interface A
    public void displayB() {
        System.out.println("Parent B");
    }
}

public class Multiple {
    static void main() {
        C c = new C();//create an object of class C
        c.displayA();//calling method from c
        c.displayB();
    }
}
