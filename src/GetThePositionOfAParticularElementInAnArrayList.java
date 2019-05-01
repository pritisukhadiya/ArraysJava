import java.util.ArrayList;

public class GetThePositionOfAParticularElementInAnArrayList {

    // Write a java program to get the position of
    // a particular element in an ArrayList?
    public static void main(String[]args){

        // create an empty array list with an initial capacity
        ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

        // use add() method to add elements in the list
        arrlist.add(15);
        arrlist.add(22);
        arrlist.add(30);
        arrlist.add(40);
        arrlist.add(50);
        // let us print all the elements available in list
        for (Integer number : arrlist) {
            System.out.println("Number = " + number);
        }

        // retrieves element at 4th postion
        int retval = arrlist.get(0);
        System.out.println("Retrieved element is = " + retval);
    }
    }

