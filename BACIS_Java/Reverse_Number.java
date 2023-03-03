// write the program to reverse the given number..
// Example:- 23456    ans:- 65432.
import java.util.*;
public class Reverse_Number{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
    
      /*  while(n>0){
            int rev_Digit = n % 10;
            System.out.print(rev_Digit);
            n = n/10;
        }

        We use Both method to solve this ans;
        */
       /* int ans = 0;
        while(n>0){
            int rev_Digit = n % 10;
            ans = ans*10 + rev_Digit;
            n = n/10;
        }
        */
        int ans = 0;
        while(n!=0){
            int rev_Digit = n % 10;
           /* if(ans > Integer.MAX_VALUE/10 || ans < Integer.MIN_VALUE/10){
                System.out.print(0);
            }*/
            ans = ans*10 + rev_Digit;
            n = n/10;
        }
        System.out.println("The reverse digite is: "+ans);
    }
}
