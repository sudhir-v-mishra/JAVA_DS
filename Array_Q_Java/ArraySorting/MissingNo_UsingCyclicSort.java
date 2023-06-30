/*LeetCode Question:-
 * 448. Find All Numbers Disappeared in an Array.
 *      Given an array nums of n integers where nums[i] is  in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
 * 
 * Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6].
 */
import java.util.*;
public class MissingNo_UsingCyclicSort {
    public static void main(String[] args){
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = missingNumber(arr);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        } 
    }
    public static List<Integer> missingNumber(int[] arr){
        int i = 0;
        while(i<arr.length){
            int pos = arr[i]-1;
            if(arr[pos] != arr[i]){
                int temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int j=0;j<arr.length;j++){
            if(arr[j] != j-1){
                ans.add(j);  
            }
        }
        return ans;
    }
}
