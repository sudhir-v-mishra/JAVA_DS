/*
Example 1:

Input: array = [1,2,3,4,5,3,1], target = 3
Output: 2
Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.

Example 2:

Input: array = [0,1,2,4,2,1], target = 3
Output: -1
Explanation: 3 does not exist in the array, so we return -1.

*/

public class Find_In_MountainArray{
    public static void main(String[] args){
        int[] arr = {0,5,3,1};
        int target = 1;
        int ans = findIndex(arr,target);
       System.out.println("Element found at index:"+ans);
    }
    public static int findIndex(int[] arr,int target){
      int start = 0;
      int end = arr.length-1;
      while(start<end){
        int mid = start+(end-start)/2;
        if(arr[mid]<arr[mid+1]){
            start = mid+1;
        }
        else{
            end = mid;
        }
      }
       int t = findElementAcendingArray(arr,target,0,end);
       if(t!=-1){
        return t;
       }
       else{
         return findElementDecendingArray(arr,target,start,arr.length-1);
       }
    }
    public static int findElementAcendingArray(int[] arr,int target,int start,int end){
      while(start<=end){
        int mid = start + (end - start)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]<target){
            start = mid + 1;
        }
        else{
            end = mid - 1;
        }
      }
      return -1;
    }
    public static int findElementDecendingArray(int[] arr,int target,int start,int end){
        while(start<=end){
        int mid = start + (end - start)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            start = mid + 1;
        }
        else{
            end = mid - 1;
        }
      }
      return -1;
    }
}