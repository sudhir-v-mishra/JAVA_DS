// create 2D array and print.
import java.util.*;
public class Array_2DCreation{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the element in 2D Array: ");
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col] = in.nextInt();
            }
        }
        in.close();
        /*for(int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }*/
                  // OR
        /*for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }*/
              //    OR
        for(int[] num : arr){
            System.out.println(Arrays.toString(num));
        }
    }
}
