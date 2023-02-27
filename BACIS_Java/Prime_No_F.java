import java.util.*;
public class Prime_No_F{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to cheak prime or not: ");
        int n = in.nextInt();
        cheakPrime(n);
    }
    public static void cheakPrime(int n){
        for(int i=2;i<n;i++){
            if(n % i == 0){
                System.out.println("Number is not Prime");
                break;
            }
            else{
                System.out.println("Number is prime");
                break;
            }
        }
        return;
    }
}