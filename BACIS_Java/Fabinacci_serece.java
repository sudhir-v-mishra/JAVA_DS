// print the Fibanacci serice.
import java.util.*;
public class Fabinacci_serece{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the n number you want to print Fab_serice:  ");
        int n = in.nextInt();
        int a=0;
        int b=1;
        int count=2;
        System.out.print(a+"  ");
        System.out.print(b+"  ");
        while(count<=n){
            int c = a+b;
            System.out.print(c+"  ");
            a=b;
            b=c;
            count = count+1;
        }
    }
}