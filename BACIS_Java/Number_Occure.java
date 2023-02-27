// print the same number occure in the given Digite.
// Example == 1434234.. find 4 occurence .. Ans is ==3. three time four is occure.
import java.util.*;
public class Number_Occure{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to find occurence: ");
        int n = in.nextInt();
        System.out.print("Enter the search element: ");
        int search = in.nextInt();
        int ans = 0;
        // note:- kici digit ma mod 10 karna  per humko us digite ka last element milta hai.
        // example:- 2321 % 10 = 1.

        // note:- kisi digite ko 10 sa divide karna per last ka yak element kam ho jata hai.
        // Example:- 2324 / 10 = 232.4 #-- point ka baad ki value nahi consider ki jati.

        while(n>0){
            int remander = n % 10;
            if(remander == search){
                ans = ans+1;
            }
                n = n / 10;
        }
        System.out.println("The total occurence are: "+ans);

    }
}