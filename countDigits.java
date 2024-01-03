//Basics Math problems 
//01-  Count Digits



public class Solution {
    public static int countDigits(int n){
        // Write your code here.
        int count =0;
        int num =n;
        while(num > 0){
            int res = num % 10;            
            if(res != 0){
                if( n % res ==0)count++;
            }
            num=num/10;
        }
        return count;
    }
}