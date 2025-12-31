package Constructors;
class D{
    String name;
    String pass;

    D(String n, String p){
        this.name = n;
        this.pass = p;

    }

}

public class Parameterized {
    public static void main(String[] args){
        D d = new D("nihal", "123abc");
        D d1 = new D("Adnan", "123456");

        System.out.println(d.name + " " + d.pass );
    }
}
