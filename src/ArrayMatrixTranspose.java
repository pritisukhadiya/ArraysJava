public class ArrayMatrixTranspose {

    //Write a java program to Transpose the Matrix
    public static void main(String[]args){

        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

        //Printing Matrix Without Transposing using for loop
        System.out.println("Printing Matrix Without Transposing");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            //New line
            System.out.println();
        }
        //Printing Matrix After Transpose (row value should be transposed to col-
        //umn and column value should be printed in row)
        System.out.println("Printing Matrix After Transpose");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[j][i]+" ");
            }
            //New line
            System.out.println();
        }



    }

}
