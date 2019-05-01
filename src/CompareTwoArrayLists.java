import java.util.ArrayList;

public class CompareTwoArrayLists {

    //Write a Java program to compare two array lists
    public static void main(String[]args){

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("JavaFx");
        list1.add("Java");
        list1.add("WebGL");
        list1.add("OpenCV");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("JavaFx");
        list2.add("Java");
        list2.add("WebGL");
        list2.add("OpenCV");
        System.out.println(list2);
       /* compare two array lists using the equals() method of
        the ArrayList class, this method accepts a list object
        as a parameter, compares it with the current object,
        in case of the match it returns true and if not it returns false.*/
        System.out.println(list1.equals(list2));
    }
    }

