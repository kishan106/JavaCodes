import java.util.Scanner;

public class prg3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int n=sc.nextInt();
        if(n>=0 && n<=9)
        {
            System.out.println("entered number is a single digit number");
        }
        else if(n>9 && n<=99) {
            System.out.println("entered number is a double digit number");

        }
        else {
            System.out.println("entered number is a three digit number");
        }
    }
}
