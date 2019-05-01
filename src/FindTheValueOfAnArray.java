public class FindTheValueOfAnArray {

    //java program to check an element is present in array or not

    public static void main(String[]args){
        //declaration, instantiation and initialization
        int[]num = {1,2,3,4,5};
        //num 2 needs to find in array
        int tofind = 2;
        //pass the boolean condition
        boolean found = false;

        for(int n : num){
            if(n==tofind){
                found = true;
                break;
            }
        }
        //use ifelse for result to be found or not
        if(found)
            System.out.println(tofind + " is found");
            else
                System.out.println(tofind + " is not found.");
        }
    }

