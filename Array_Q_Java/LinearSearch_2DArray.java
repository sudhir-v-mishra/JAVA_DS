// apply linear search in 2D array.
import java.util.*;
public class LinearSearch_2DArray{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the element in array: ");
        int[][] arr = new int[3][3];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col] = in.nextInt();
            }
        }
        for(int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
        System.out.print("Enter the search element: ");
        int search = in.nextInt();
        int[] ans = search2DArray(arr,search);
        System.out.println(Arrays.toString(ans));
       
    }
    public static int[] search2DArray(int arr[][],int search){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==search){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}