import java.util.*;
public class Array_0_1_Sort{
    public static void main(String[]arr){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = in.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = in.nextInt();
        }
        in.close();
        int left = 0;
        int right = arr1.length-1;
        while(left < right){
            if(arr1[left]==1 && arr1[right]==0){
                int temp = arr1[left];
                arr1[left] = arr1[right];
                arr1[right] = temp;
                left++;
                right--;
            }
            else if(arr1[left]==1 && arr1[right]==1){
                right--;
            }
            else{
                left++;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
    
}