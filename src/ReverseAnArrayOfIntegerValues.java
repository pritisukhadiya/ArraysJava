import java.util.Arrays;

public class ReverseAnArrayOfIntegerValues {

    //Write a Java program to reverse an array of integer values.

    public static void main(String[]args){
        int[]my_array1 = { 6,7,8,9,10};
        //print the original array
        System.out.println("Originalarray:"+ Arrays.toString(my_array1));
        for(int i = 0;i < my_array1.length/2;i++){
            int temp = my_array1[i];
            my_array1[i] = my_array1[my_array1.length - i - 1];
            my_array1[my_array1.length - i - 1] =temp;
        }
        //print the reverse array
        System.out.println("Reverse array :"+Arrays.toString(my_array1));


    }
}
