// find position of an element in a sorted array of infinite number.
import java.util.*;
public class FindPositionInSortedArray{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int[] arr = {3,5,7,9,10,90
        ,100,130,140,160,170};
        System.out.print("Enter the target element: ");
        int target = obj.nextInt();
        System.out.println(actualAns(arr,target));
    }
    public static int actualAns(int[] arr,int target){
        int start = 0;
        int end = 1;
        int val = arr[0];
        while(val < target){
          start = end;
          if(2*end<arr.length-1){
            end = 2*end;
          }
          else{
            end = arr.length-1;
          }
          val = arr[end];
          
        }
        return binarySearch(arr,target,start,end);
    }
   public static int binarySearch(int[] arr,int target,int start,int end){
    while(start<=end){
        int mid = (start+end)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]<target){
            start = mid+1;
        }
        else{
            end = mid - 1;
        }
    }
    return -1;
   }
}