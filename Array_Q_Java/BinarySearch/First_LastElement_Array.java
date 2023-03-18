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
        int n = arr.length;
        int i = 0;
        firstAndLastElement(arr,target,n,i);
        System.out.print(first+",");
        System.out.println(last);
    }
   public static void firstAndLastElement(int[] arr,int target,int n,int i){
    if(i==n){
        return;
    }
    if(arr[i] == target){
        if(first == -1){
            first = i;
        }
        else{
            last = i;
        }
    }
    firstAndLastElement(arr,target,n,i+1);
   }
}