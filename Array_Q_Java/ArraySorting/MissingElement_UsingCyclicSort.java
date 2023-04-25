// find the missing number in array using cyclic sort.
// leetcode problem:- 268.
public class MissingElement_UsingCyclicSort {
    public static void main(String[] args){
        int[] arr = {3,0,1};
        int ans = missing_Number(arr);
        System.out.println("the missing number:"+ans);
    }
    public static int missing_Number(int[] arr){
        int i = 0;
        while(i<arr.length){
            int position = arr[i];
            if(arr[i] < arr.length && position != i){
                int temp = arr[position];
                arr[position] = arr[i];
                arr[i] = temp;
                
            }
            else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j] != j){
               return j;
            }
        }
        return arr.length;
    }
}

