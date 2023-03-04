import java.util.*;
public class BinarySearch{
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
        int ans = binarySearch(arr,search);
        if(ans == -1){
            System.out.println("Element not found:");
        }
        else{
            System.out.println("Element found at index: "+ans);
        }
    }
    public static int binarySearch(int[] arr,int search){
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        while(start<=end){
            if(arr[mid] == search){
                return mid;
            }
            else if(arr[mid]<search){
                start = mid+1;
                mid = (start+end)/2;
            }
            else{
                end = mid-1;
                mid = (start+end)/2;
            }
        }
        return -1;
    }
}