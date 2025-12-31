// class --> interface = implements
// class --> class = extends
// interface --> interface = extends


package DataTypes.NonPrimitive;

interface A{
    String str = "Hello";
    String str2 = "World";
    default void show(){
        System.out.println("Show method");
    }
    void display();
}

class B implements A{
    @Override
    public void display() {
        System.out.println("It's displaying display method");
    }
}

public class Interface {
    public static void main(String[] args){
        A a = new B();
        a.display();
        a.show();
        System.out.println(A.str + " " + A.str2);
    }
}
