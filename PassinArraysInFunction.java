
import java.util.Arrays;

public class PassinArraysInFunction {
    
    public static void main(String[] args) {
       int[] nums={3,4,5,6};
       System.out.println(Arrays.toString(nums)); 
       change(nums);
       System.out.println(Arrays.toString(nums));
    }
    public static void change(int[] arr){
        //arrays are mutable we can change it
        arr[0]=99;
    }
}
