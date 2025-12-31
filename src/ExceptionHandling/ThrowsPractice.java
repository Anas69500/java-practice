package ExceptionHandling;
class A{
    public void show() throws ClassNotFoundException {
        System.out.println("loading....");
        Class.forName("All");
    }
}

public class ThrowsPractice {
    public static void main(String[] args){
        A a = new A();
        try {
            a.show();
        } catch (ClassNotFoundException e) {
            System.out.println("Something went wrong!!!");
        }
    }
}
