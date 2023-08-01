public class sum_series {
    public static void main(String[] args) {
        double sum=0;
        for(int i=0; i<=10;i++) {
            sum = sum + Math.pow(2,i);

        }
        System.out.println(sum);
    }
}
