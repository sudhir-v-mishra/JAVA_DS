// Make a Function to Add two number and Return the sum.
import java.util.*;
public class Add_2_Number_F{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1 = in.nextInt();
        System.out.print("Enter the second number:");
        int num2 = in.nextInt();
        int s= sum(num1,num2);
        System.out.println("The sum is:"+s);
    }
    public static int sum(int num1,int num2){
        int sum_val = num1+num2;
        return sum_val;
    }
}