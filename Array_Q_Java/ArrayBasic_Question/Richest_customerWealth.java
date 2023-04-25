/* 1672:-find the Richest customer Wealth in 2D array.
   Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation: 
1st customer has wealth = 6
2nd customer has wealth = 10 
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.
*/


public class Richest_customerWealth{
    public static void main(String[] args){
        int[][] accounts = {
            {2,8,7},
            {7,1,3},
            {1,9,5}
        };
        int ans = maximumWealth(accounts);
        System.out.println("The maximum Wealth is:"+ans);
    }
    public static int maximumWealth(int[][] accounts) {
        int sum =0;
        int max = 0;
        for(int row=0;row<accounts.length;row++){
            sum = 0;
            for(int col=0;col<accounts[row].length;col++){
                sum = sum + accounts[row][col];
            }
            
            if(sum>max){
                max = sum;
            }
        }
        return max;
    }
}