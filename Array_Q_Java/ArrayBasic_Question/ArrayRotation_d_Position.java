/*
Program for array left rotation by d positions.

 Input: 
arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
Output: 3 4 5 6 7 1 2

Input: arr[] = {3, 4, 5, 6, 7, 1, 2}, d=2
Output: 5 6 7 1 2 3 4
*/
import java.util.*;
public class ArrayRotation_d_Position{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element in array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the position to reverse the array: ");
        int d = in.nextInt();
        in.close();
        rotation(arr,d,n);
        printArray(arr,n);
    }
    public static void rotation(int arr[],int d,int n){
        int[] temp = new int[n];
        int k = 0;
        for(int i=d;i<n;i++){
            temp[k] = arr[i];
            k++;
        }
        for(int i=0;i<d;i++){
            temp[k] = arr[i];
            k++;
        }
        for(int i=0;i<n;i++){
            arr[i] = temp[i]; 
        }
    }
    public static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
         System.out.print(arr[i]+" ");    
        }
    }
}