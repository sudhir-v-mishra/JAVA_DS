import java.util.*;
public class Selection_Sort {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = in.nextInt();
        System.out.println("Enter the element in Array:");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;   
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
