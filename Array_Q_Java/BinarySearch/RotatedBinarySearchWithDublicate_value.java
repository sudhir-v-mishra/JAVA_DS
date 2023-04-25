/*
Rotated binary search in Array with duplicate value and find number of rotation of array;
*/
import java.util.*;
public class RotatedBinarySearchWithDublicate_value{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array");
        int n = in.nextInt();
        System.out.println("Enter the element in array:");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        in.close();
        int ans = findNumberOfRotation(arr);
        System.out.println("The number of rotation is:"+(ans+1));

    }
    public static int findNumberOfRotation(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start);
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            else if(arr[start]==arr[mid] && arr[mid]==arr[end]){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(arr[start]<arr[mid] || arr[start] == arr[mid] && arr[mid]>arr[end]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}