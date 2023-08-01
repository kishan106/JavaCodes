import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         double discount=0;
         double total_amount;
        System.out.println("enter the purchased amount");

        double amount = sc.nextDouble();

        if(amount>=1 && amount<= 2000) {
            discount = amount*(0.05);
        }
        else if(amount >=2001 && amount <= 5000) {
            discount = amount*(0.25);
        }
        else if(amount>=5001 && amount <=10000) {
            discount =  amount*(0.35);

        }
        else {
            discount = amount*(0.50);
        }

        total_amount=amount-discount;
       System.out.println(total_amount);
    }

}
