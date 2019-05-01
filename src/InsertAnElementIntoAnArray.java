import java.util.Arrays;

public class InsertAnElementIntoAnArray {

    //Write a Java program to insert an element (specific position)
    //into an Array

    public static void main(String []args){

        //declaration, instantiation and initialization
        int[]array = {1,2,4,5,6,7,8,9};
        //insert an element in 3rd position of the array(index->2,value->3)

        int Index_position = 2;
        int newValue = 3;

        System.out.println("Original Array : "+ Arrays.toString(array));

        for(int i = array.length-1;i>Index_position;i--){
            array[i] = array[i-1];

        }
        array[Index_position] = newValue;
        System.out.println("new Array: "+Arrays.toString(array));

    }

}
