package DataTypes.NonPrimitive;
//this is how we declare a class we have to use class keyword, ClassName and curly bracket
class Student{
    int roll = 10;
}

public class ClassAndObject {
    public static void main(String[] args){
        //we initialize an object of Student class name it as st
        Student st = new Student();
        System.out.println(st.roll);
    }
}
