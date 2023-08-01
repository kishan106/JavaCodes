import java.util.Scanner;

public class switch_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("enter your choice");
        int d = sc.nextInt();

        switch (d) {
            case 1:
               // System.out.println("you are doing addition");
                System.out.println("final output is: "+(a+b));
                break;
            case 2:
              //  System.out.println("you are doing subtraction");
                System.out.println("final output is: "+(a-b));
                break;
            case 3:
              //  System.out.println("you are doing multiplication");
                System.out.println("final output is:"+(a*b));
                break;
            case 4:
               // System.out.println("you are doing division");
                System.out.println("final output is: "+(a/b));
                break;
            default:
                System.out.println("wrong input given");

        }
    }
}
