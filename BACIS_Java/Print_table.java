// Print the table of a number Input by the user..

import java.util.*;
public class Print_table{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        int i=1;
        for(i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }
}