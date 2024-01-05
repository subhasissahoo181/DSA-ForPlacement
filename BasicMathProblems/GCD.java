// Java program to find GCD & HCF
import java.util.*;
class Gcd{
    public static int gcdhcf(int a, int b){
      int res = Math.min(a,b);
      while( res >0){
          if(a % res ==0 && b%res == 0){
              break;
              
          }
          res --;
          
      }
      return res;
        
    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter 2 number.");
        int a = sc.nextInt();
        int b = sc.nextInt();
       
       System.out.println("gcd is " + gcdhcf(a,b));
    }
}