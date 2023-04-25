// find the maximum value in 2D array:
import java.util.*;
public class MaxValue_2DArray{
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
       
        int ans = maxValue(arr);
        System.out.println("The maximum value is: "+ans);
       
    }
    public static int maxValue(int arr[][]){
        int max = arr[0][0];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}