// find Largest and Smallest value in given array.
import java.util.*;
public class LargestSmallestVal_array{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element in array:");
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        int largest = 0;
        int smallest = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            else{
                smallest=arr[i];
            }

        }
        System.out.println("The largest value is: "+largest);
        System.out.println("The smallest value is:"+smallest);
    }
}