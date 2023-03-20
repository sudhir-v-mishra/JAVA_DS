/*
An array arr a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

You must solve it in O(log(arr.length)) time complexity.
Example:-
     Input: arr = [0,2,1,0]
     Output: 1
    
Example:-
    Input: arr = [0,10,5,2]
    Output: 1
*/
public class PeakIndex_In_Mountain{
    public static void main(String[] args){
        int[] arr = {0,10,5,2};
        int ans = findPeakIndex(arr);
        System.out.println("The index of Lanrger element is:"+ans);
    }
    public static int findPeakIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid =start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
}