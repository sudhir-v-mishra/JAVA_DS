// find ceiling value of a sorted array.
// means find target value and value is smallest grater then or equal to target value.
import java.util.*;
public class CeilingArray_BinarySearch{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n = in.nextInt();
        System.out.println("Enter the element in array:");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the target value:");
        int target = in.nextInt();
        int ans = ceilingArray(arr , target);
            System.out.println("Element is found: "+ans);
    }
    public static int ceilingArray(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        while(start<=end){
            int ans = 0;
            if(arr[mid] < target){
                start = mid +1;
                mid = (start+end)/2;
            }
           else if(arr[mid]>target){
                end = mid-1;
                mid = (start+end)/2;
            }
            else if(arr[mid] == target){
                ans = arr[mid];
                return ans;
            }
        }
        return arr[start];
    }
}