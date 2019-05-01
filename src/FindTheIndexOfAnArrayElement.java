import java.util.ArrayList;

public class FindTheIndexOfAnArrayElement {

   //write a java program to find the index of an array element.

    public static void main(String[]args){

        //ArrayList object
        ArrayList arrayList=new ArrayList();

        //adding elements in the list
        arrayList.add("10");
        arrayList.add("20");
        arrayList.add("30");
        arrayList.add("40");
        arrayList.add("50");

        //serching element"50"
        int index = arrayList.indexOf("50");

        if(index==-1)
            System.out.println("Element not found in the list");
        else
            System.out.println("Element found @ index:" + index);
    }
}
