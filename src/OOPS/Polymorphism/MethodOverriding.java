/*
This code is for taking Add two value by using Method Overriding in it
And in Method overriding we have give same method name, parameter data type or number of parameter
 */
package OOPS.Polymorphism;

//we create a class with name Add
class Add {

    //create a method and give int data type to it and have a two in data type parameter
    public int A(int n, int m) {
        //return Added value
        return n + m;
    }

}
//Here we inherit class Add in Add2
class Add2 extends Add {
    @Override // It's an Annotation of overriding, it's used by compiler to understand how to treat that code
    //Here we write Same method name, data type and number of parameter
    public int A(int n, int m) {
        return n + ++m;//but we can rewrite it
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        //create a object of Add2 class
        Add2 a = new Add2();

        //passing value and storing value in variable
        int b = a.A(2,4);

        //printing output
        System.out.println(b);
    }
}
