import java.util.Scanner;

public class sum_of_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f=1, s=0;

        for( int i=1; i<=n; i++) {
            f=f*i;
            s=s+f;
        }
        System.out.println("sum = "+s);
    }
}
