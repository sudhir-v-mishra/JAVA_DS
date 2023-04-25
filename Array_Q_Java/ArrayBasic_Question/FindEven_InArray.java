// find the numbers with even number of digite in array.
/*
   Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
*/
import java.util.*;
public class FindEven_InArray{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] nums = {555,901,482,1771};
       int ans = findNumbers(nums);
       System.out.println("The even number of digite is: "+ans);
    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        int f = 0;
        for(int i=0;i<nums.length;i++){
            int index = nums[i];
            while(index>=1){
                index = index/10;
                count++;
            }
            if(count%2==0){
                f++;
            }
        }
        return f;
    }
}
    
