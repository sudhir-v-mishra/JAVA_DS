// code for Order-agnostic binary search.
// means we don't no it is sorted by incressing or decressing order.
import java.util.*;
public class BinarySearch2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element in array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the search element:");
        int search = in.nextInt();
        in.close();
        int ans = binarySearch2(arr,search);
        if(ans == -1){
            System.out.println("Element not found:");
        }
        else{
            System.out.println("Element found at index: "+ans);
        }
    }
    public static int binarySearch2(int[] arr,int search){
        int start = 0;
        int end = arr.length-1;
        boolean isAccending = arr[start] < arr[end];
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==search){
                return mid;
            }
            if(isAccending){
                if(arr[mid]<search){
                    start = mid +1;
                    mid = (start+end)/2;
                }
                else{
                    end = mid-1;
                    mid = (start+end)/2;
                }
            }
            else{
                if(arr[mid]>search){
                    start = mid +1;
                    mid = (start+end)/2;
                }
                else{
                    end = mid-1;
                    mid = (start+end)/2;
                }
            }
        }
        return -1;
    }
}