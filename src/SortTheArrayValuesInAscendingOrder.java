import java.util.Arrays;

public class SortTheArrayValuesInAscendingOrder {

    //WAP to enter array and sort the values in ascending order
    public static void main(String[]args){

        //our arr contains 8 element
        //declaration, instantiation and initialization
        int[]arr = {13,7,6,45,21,9,101,102};

        String[]arr1= {"Rishi","Abhi","Deep","Priti"};

        //using Array.sort(). it by default sort in ascending order
        Arrays.sort(arr);
        //print the result
        System.out.println("Sorted numaric array :"+Arrays.toString(arr));
        //using Array.sort(). it by default sort in ascending order
        Arrays.sort(arr1);
        //print the result
        System.out.println("Sorted string array :"+Arrays.toString(arr1));
    }
}




