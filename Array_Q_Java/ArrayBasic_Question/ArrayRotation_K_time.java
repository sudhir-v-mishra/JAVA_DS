import java.util.*;
public class ArrayRotation_K_time{
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       System.out.print("Enter the size of array:");
       int n = in.nextInt();
       System.out.println("Enter the element in array:");
       int[] nums = new int[n];
       for(int i=0;i<nums.length;i++){
        nums[i] = in.nextInt();
       }
       System.out.print("Enter the k value to ratate the array:");
       int k = in.nextInt();
       in.close();
       reverse(nums,0,nums.length-1);
       reverse(nums,0,k-1);
       reverse(nums,k,nums.length-1);
       System.out.println(Arrays.toString(nums));

    }
    public static void reverse(int[] nums,int start,int end){
         while (start<end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
         }
    }
}