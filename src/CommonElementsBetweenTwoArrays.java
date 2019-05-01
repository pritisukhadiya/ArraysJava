public class CommonElementsBetweenTwoArrays {

    //Write a Java program to find the common elements between two arrays

public static void main(String []args){

    //declaration, instantiation and initialization
    // of two different string array

    String[] numArray1 = {"Riya","Rima","Siya"};

    String[]numArray2 = {"Raj","taj","Riya"};

    //outer loop
    //compare one by one name in both string
    for(int i = 0;i<numArray1.length;i++){
        for(int j = 0;j<numArray2.length;j++){
            //inner loop
            //checkin the same name in both string
            if(numArray1[i].equals(numArray2[j])){
                System.out.println(numArray1[i]);
                break;
            }
        }
    }
}
}
