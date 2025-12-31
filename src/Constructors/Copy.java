package Constructors;
class C{
    String a ;
    int b;
    C(String a, int b){
        this.a = a;
        this.b = b;
    }
    C(C c){
         this.a = c.a;
         this.b = c.b;
    }
}
public class Copy {
    public static void main(String[] args){
        C c1 = new C("abc", 12);

        C c2 = new C(c1);
        System.out.println(c2.a);
    }
}
