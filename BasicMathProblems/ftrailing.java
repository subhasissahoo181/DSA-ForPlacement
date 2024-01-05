// Java program to find ftrailing 0s in n!
import java.util.*;
class tfactorial{
    public static int tfactorial(int n){
      if(n < 0){
           return -1;
       }
       int count =0;
       for(int i=5; i<=n; i=i*5){
           count = count+ n/i;
       }
       return count;
        
    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the number.");
        int n = sc.nextInt();
       
       System.out.println("ftrailing of "+ n +" is " + tfactorial(n));
    }
}