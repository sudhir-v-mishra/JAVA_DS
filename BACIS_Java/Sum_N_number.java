// Print the Sum of First N natural number...

import java.util.*;
public class Sum_N_number{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the nth number:");
        int n = in.nextInt();
        int i = 0;
        int sum = 0;
        for(i=0;i<=n;i++){
             sum = sum + i ;
        }
        System.out.println("the sum of n number is: " +sum);
    }
}