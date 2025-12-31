@FunctionalInterface
interface A{
    void show(int i, int j);
}



public class LambdaPractice {
    public static void main(String[] args){
        A a = (int i, int j) -> {
            System.out.print("hello ");
            System.out.println(i + " " + j);
        };

        a.show(1,2);
    }
}
