public class palindrome {
    public static void main(String[] args) {
//        int n = 707;
//        int rev=0;
//        int digit;
//        rev=0;
//        digit=n%10;
//        rev=digit+rev*10;
//        n=n/10;
//        digit=n%10;
//        rev=digit+rev*10;
//        n=n/10;
//        digit=n%10;
//        rev=digit+rev*10;
//        n=n/10;
//        System.out.println("rev="+rev);
        String str= "kishan";
        String rev= "" ;
        for(int i = str.length()-1; i>=0; i--) {
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);


    }
}
