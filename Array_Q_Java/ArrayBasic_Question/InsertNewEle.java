// Insert New Element in array at ith index;
import java.util.*;
public class InsertNewEle{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size array: ");
        int n = in.nextInt();
        int[] arr = new int[n+1];
        System.out.println("Enter the element in array: ");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the position to insert element:");
        int pos = in.nextInt();
        System.out.println("Enter the new element:");
        int item = in.nextInt();
        in.close();
        for(int i=n-1;i>=pos;i--){
            arr[i+1]=arr[i];
        }
        arr[pos]=item;
        n++;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}