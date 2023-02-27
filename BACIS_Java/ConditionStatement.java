import java.util.*;
public class ConditionStatement{
    public static void main(String[] args){
        Scanner condition = new Scanner(System.in);
        System.out.print("Enter the age:");
        int age = condition.nextInt();
        if(age > 18){
            System.out.println("Your are Adult.");
        }
        else{
            System.out.println("your are not Adult.");
        }
    }
}