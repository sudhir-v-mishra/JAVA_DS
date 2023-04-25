/*
   Print array after it is right rotated K times.

Input: Array[] = {1, 3, 5, 7, 9}, K = 2.
Output: 7 9 1 3 5
Explanation:
After 1st rotation - {9, 1, 3, 5, 7}
After 2nd rotation - {7, 9, 1, 3, 5}

Input: Array[] = {1, 2, 3, 4, 5}, K = 4.
Output: 2 3 4 5 1
*/
import java.util.*;
public class ArrayRotation_On_k_time{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element in array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the number to rotate the array: ");
        int d = in.nextInt();
        in.close();
        rotation(arr,d,n);
    }
    public static void rotation(int arr[],int k,int n){
        k = k % n;
        for(int i=0;i<n;i++){
            if(i<k){
                System.out.print(arr[n+i-k]+" ");
            }
            else{
                System.out.print(arr[i-k]+" ");
            }
        }
    }
}  