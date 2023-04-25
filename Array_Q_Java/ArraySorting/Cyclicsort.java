import java.util.*;
public class Cyclicsort {
    public static void main(String[] args){
        int[] arr = {4,3,1,2,5};
        cyclic_Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cyclic_Sort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(correct != i){
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }
    }
}
