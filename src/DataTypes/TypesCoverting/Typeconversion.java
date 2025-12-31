package DataTypes.TypesCoverting;

//TypeConversion mean implicit converting  one type to other type automate

public class Typeconversion {
    public static void main(String[] args){
        int var = 10;

        //converting int into double
        double var2 = var;
        System.out.println(var2);
        System.out.println(var);

        //we can't convert double into int because we lost some data of double like after point value
        //int var3 = var2;  # here we got an error so we can convert with type casting method
    }
}
