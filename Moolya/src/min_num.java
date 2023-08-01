import java.util.Arrays;

public class min_num {
    public static void main(String[] args) {
        int[] arr = {10,3,1,52,5,58,65};
        int min=arr[0];
        for(int i=0;i<arr.length;i++) {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println(min);
        System.out.println(Arrays.stream(arr).max());
    }
}
