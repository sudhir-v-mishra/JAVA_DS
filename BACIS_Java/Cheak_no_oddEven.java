import java.util.*;
public class Cheak_no_oddEven{
    public static void main(String[] args){
        Scanner cheak = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = cheak.nextInt();
        if(num % 2 == 0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number id odd");
        }
    }
}