package DataTypes.NonPrimitive;

public class StringDT {
    public static void main(String[] args){
        //this String is immutable
        String sc = "ABC";
        System.out.println(sc);

        //StringBuilder is mutable
        StringBuilder str = new StringBuilder(sc);
        str.append("ab");
        str.deleteCharAt(4);
        System.out.println(str);

        //StringBuffer is mutable + secure
        StringBuffer str1 = new StringBuffer(sc);
        System.out.println(str1);

    }
}
