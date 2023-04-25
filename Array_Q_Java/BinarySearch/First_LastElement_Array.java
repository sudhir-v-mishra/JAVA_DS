/*
Find First and Last Position of Element in Sorted Array.
Example:-
  Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4].

Example:-
     Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1].
If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.
*/
import java.util.*;
public class First_LastElement_Array{
    static int first = -1;
    static int last = -1;
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        int[] arr = {5,7,7,8,8,10};
        System.out.print("Enter the target element:");
        int target = obj.nextInt();
        obj.close();
        System.out.print(firstSearch(arr,target)+" ");
        System.out.println(lastSearch(arr,target));
    }
   public static int firstSearch(int[] arr,int target){
    int start = 0;
    int end = arr.length;
    int ans = -1;
    while(start<=end){
        int mid = (start+end)/2;
        if(target == arr[mid]){
            ans = mid;
            end = mid-1;
        }
        else if(target<arr[mid]){
            end = mid-1;
        }
        else{
            start = mid+1;
        }
    }
    return ans;
   }
   public static int lastSearch(int[] arr,int target){
     int start = 0;
    int end = arr.length;
    int ans = -1;
    while(start<=end){
        int mid = (start+end)/2;
        if(target == arr[mid]){
            ans = mid;
            start = mid+1;
        }
        else if(target<arr[mid]){
            end = mid-1;
        }
        else{
            start = mid+1;
        }
    }
    return ans;
   }
}