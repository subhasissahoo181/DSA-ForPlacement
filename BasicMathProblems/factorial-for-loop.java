// Java program to find factorial of given number using for loop
import java.util.*;
class factorial{
    public static int factorial(int n){
       int res = 1;
       for(int i=2; i<=n; i++){
           res = res * i;
       }
       return res;
        
    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the number.");
        int n = sc.nextInt();
       
       System.out.println("Factorial of "+ n +" is " + factorial(n));
    }
}