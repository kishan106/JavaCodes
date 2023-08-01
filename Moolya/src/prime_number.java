import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int count = 0;
       for (int i=2;i<=n-1;i++) {
           if(n%i == 0) {
               count++;
           }
           if(count>0) {
               System.out.println("this is not a prime number");
           }
           else if(count==0) {
               System.out.println("this is a prime number");
           }
       }
    }
}
