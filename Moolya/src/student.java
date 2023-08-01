import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total_marks = 300;
        double marks_scored;
        double percentage;
        System.out.println("enter the marks of marks, physics, chemistry");
        double a=sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        marks_scored = a+b+c;
        percentage = (marks_scored/total_marks)*100;
        System.out.println("total marks scored: "+marks_scored);
        System.out.println("percentage: "+percentage);


        if((a>35 && b>35 && c>35) && percentage> 40.00) {
            System.out.println("student is passed");
        }
        else {
            System.out.println("student is failed");
        }

    }
}
