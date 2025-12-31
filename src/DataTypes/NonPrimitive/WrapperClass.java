package DataTypes.NonPrimitive;

public class WrapperClass {
    public static void main(String[] args){
        int var1 = 10;
        Integer num = var1;// autoboxing

        Integer num2 = Integer.valueOf(var1); //boxing

        System.out.println(num2);

        int num1 = num.intValue();//unboxing

        int num4 = num; // auto-unboxing
        System.out.println( num4);

        //converting String into int
        String value = "12";

        int dgt = Integer.parseInt(value);

        System.out.println(dgt + 2);


    }
}
