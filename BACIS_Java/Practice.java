public class Practice{
    public static void main(String[] args){
        int[] nums = {555,901,482,1771};
       int ans = findNumbers(nums);
       System.out.println("The even number of digite is: "+ans);
    }
     public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    public static boolean even(int num){
        int numberOfDigite = digite(num);
        if(numberOfDigite % 2 == 0){
            return true;
        }
        return false;
    }
    public static int digite(int num){
        if(num < 0){
            num = num* -1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}