import java.util.Scanner;

public class SumOfAnArray {
    //java program to accept array element and calculate sum

    public static void main(String[]args) {

        int n, sum = 0;
        //For code to read from screen and user input
        Scanner scanner = new Scanner(System.in);
        //print the output
        System.out.print("Enter no. of elements you want in array:");
        //print and read
        n = scanner.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the Elements:");

        //calculate the sum of array with help of for loop
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();

            sum = sum + a[i];

            System.out.println("sum:"+sum);
        }

    }
}
