package DataTypes.NonPrimitive;

public class Array {
    public static void main(String[] args){
        //method 1 to declaration the array
        int[] arr = new int [10];

        //method 2 to declaration the array
        int arr1[];
        arr = new int[3];

        //method 3 to declaration + initialize value of an array
        int[] arr2 = {1, 2, 3};

        //updating value of an array
        arr2[2] = 4;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        //two-d array declaration
        int[][] arr3 =new int[2][3];


    }
}
