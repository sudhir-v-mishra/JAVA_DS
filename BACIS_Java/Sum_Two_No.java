import java.util.*;
public class Sum_Two_No{
    public static void main(String[] args){
        Scanner sum = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int a = sum.nextInt();
        System.out.println("Enter The Second Number:");
        int b = sum.nextInt();


        int sum_val = a + b;
        System.out.println("The Sum of Two value:" + sum_val);
    }
}