// find the Factorial of a number.
import java.util.*;
public class Factorial_F{
    public static void printFactorial(int n){
       int factorial = 1;
       if(n <= 0){
        System.out.println("Invalied Number!");
        return;
       }
       for(int i=n;i>=1;i--){
        factorial = factorial * i;
       }
       System.out.println("the factorial is: "+ factorial);
       return;

    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the factorial number: ");
        int n = in.nextInt();
        printFactorial(n);
    }
}