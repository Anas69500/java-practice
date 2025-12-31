package Constructors;

class A{
    int id;
    String pass;
    A(){

    }
}


public class Default {
    public static void main(String[] args){
        A a = new A();
        a.id = 21;
        a.pass = "123";
        System.out.println(a.id);
        System.out.println(a.pass);

    }
}


