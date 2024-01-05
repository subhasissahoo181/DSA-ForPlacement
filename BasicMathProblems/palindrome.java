// Write a java program Palindrome Numbers
import java.util.*;
class Palindrome{
    public static boolean palindrome(int n){
        int num = n;
        int reverse = 0;
        while(num != 0){
            int lastdigits = num % 10;
            reverse = reverse+lastdigits;
            reverse = reverse * 10;
            num = num / 10;
        }
        return (reverse == n);
        
    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Check pelindrome.");
        int n = sc.nextInt();
       
        // int n = 656;
        if(palindrome(n) == true){
            System.out.println("The number is pelindrome...");
        }
        else{
            System.out.println("The number is not a pelindrome");
        }
    }
}