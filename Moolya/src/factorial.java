import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
      // Scanner sc = new Scanner(System.in);
      //  System.out.println("enter the number");
       // int num=sc.nextInt();
         int fact=1;
         for(int i=1; i<=5;i++) {
             fact=fact*i;
         }
        System.out.println("factorial of 5 is "+fact);
    }
}
