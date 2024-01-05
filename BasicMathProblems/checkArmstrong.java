// Check Armstrong


import java.util.Scanner;
public class Main {
	
    public static boolean armstrong(int n){
        int num = n;
        int sum = 0;
        int pow = (int) Math.log10(n)+1;
        while(n != 0){
            int res = n%10;
            sum = sum + (int)Math.pow(res,pow);
            n=n/10;
        }
        return (sum == num);
    }
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(armstrong(n));

	}
}
