import java.util.*;
public class LinearSearch{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = in.nextInt();
        System.out.println("Enter the element in array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the Search Element:");
        int search = in.nextInt();
        in.close();
        int ans =  l_Search(arr,search);
        if(ans == -1){
        System.out.println("Element not found:");
        }
        else{
            System.out.println("Element found at index: "+ans);
        }
    }
    public static int l_Search(int arr[],int search){
          for(int i=0;i<arr.length;i++){
            if(arr[i] == search){
                return i;
            }
          }
          return -1;
    }
}