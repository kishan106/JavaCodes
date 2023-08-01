class magic_num {

    public  void  mgn(int n) {
        int r, s;
        while(n>9) {
            s=0;
            while(n!=0) {
                r = n % 10;
                s = s + r;
                n = n / 10;
            }
            n=s;

            }
        if(n==1) {
            System.out.println("its an magic number");
        }
        else {
            System.out.println("its not an magic number");
        }
        }
    }



public class magic_number {

    public static void main(String[] args) {
        magic_num obj =new magic_num();
        obj.mgn(20);

    }
}
