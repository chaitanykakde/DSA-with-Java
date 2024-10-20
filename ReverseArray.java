
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a={10,20,39,40,50};
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
    public static void reverse(int[] a){
        int start=0;
        int end=a.length-1;
        while(start!=end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;end--;
        }

    }
}
