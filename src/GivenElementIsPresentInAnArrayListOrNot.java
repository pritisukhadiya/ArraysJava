import java.util.ArrayList;

public class GivenElementIsPresentInAnArrayListOrNot {

    //WAP to check whether the given element is present in an
    // ArrayList or not?
    public static void main(String []args){

        ArrayList<String> list = new ArrayList<>(2);
// we have few alphabets stored in the arraylist.
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
// We will try to find out if letter “A” and “Z” are
// present in the list or not using list.contain().
        System.out.println( list.contains("A") );       //true

        System.out.println( list.contains("Z") );       //false
    }
    }


