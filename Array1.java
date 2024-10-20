import java.util.Arrays;
import java.util.Scanner;
public class Array1 {

    public static void main(String[] args) {
        int[] arr;//declaration
        arr=new int[5];
        Scanner sc=new Scanner(System.in);
     
        // for(int i=0;i<arr.length;i++){
        //      arr[i]=sc.nextInt();

        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]+" ");
        // }
        // for(int num:arr){
        //     System.out.println(num+" ");
        // }
     

        String[] str=new String[4];
        for(int i=0;i<str.length;i++){
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));
        
        
    }
    
}
