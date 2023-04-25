// create array and print array.
import java.util.*;
public class CreateArray{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        in.close();
        /*for(int num : arr){
            System.out.print(num+" ");
          }
          */        
                  // OR

        /*  for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
          } */
                  // OR

          System.out.println(Arrays.toString(arr));
    }
}