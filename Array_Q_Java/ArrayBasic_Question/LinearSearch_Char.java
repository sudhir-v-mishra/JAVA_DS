// Apply Linear Search to give String .
import java.util.*;
public class LinearSearch_Char{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String to fing element:");
        String str = in.nextLine();
        System.out.println("Enter the search element: ");
        char search = in.next().charAt(0);
        
       int ans = stringSearch(str,search);
       if(ans == -1){
        System.out.println("Charter is not found:");
       }
       else{
        System.out.println("Charter is found: "+ans);
       }

    }
    public static int stringSearch(String str,char search){
        if(str.length()==0){
            return -1;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==search){
                return i;
            }
        }
        return -1;
    }
}