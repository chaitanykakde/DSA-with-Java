
import java.util.Arrays;

public class ArrayIndexSwap {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5};
        swap(ar,1,2);
        System.out.println(Arrays.toString(ar));
    }

    private static void swap(int[] ar, int i, int j) {
       int temp=ar[i];
       ar[i]=ar[j];
       ar[j]=temp;
    }
    
}
