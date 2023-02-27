import java.util.*;
public class Calculater_program{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("Enter the two number: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                 if(op == '*'){
                    ans = num1 * num2;
                }
                 if(op == '/'){
                    if(num1 != 0 && num2 !=0 ){
                        ans = num1 / num2;
                    }  
                }
                 if(op == '%'){
                    ans = num1 % num2;
                }
            }
             else if(op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("Invalid Operator!!");
            }
            System.out.println("the Calculated value is: " +ans);
        }
    }
}