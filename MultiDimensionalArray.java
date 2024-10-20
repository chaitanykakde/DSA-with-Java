import java.util.Arrays;
import java.util.Scanner;
public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9
         */
       // int[][] arr=new int[3][];//adding rows is mandatory 
        //adding colum size is not mandatory

    //   int arr2D[][]={
    //         {1,2,3},//oth index
    //         {4,5},//1st index
    //         {7,8,9,6}//2nd index
    //     };
    //   //output
    //   for(int i=0;i<arr2D.length;i++){
    //     for(int j=0;j<arr2D[i].length;j++){
    //      System.out.print(arr2D[i][j]+" ");
    //     }
    //     System.out.println();
    //   }
    int[][] a=new int[3][3];
     
     for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
            a[i][j]=in.nextInt();
             
        }
     }
     for(int row=0;row<a.length;row++){
        System.out.println(Arrays.toString(a[row]));
     }
     for(int[] g:a){
        System.out.println(Arrays.toString(g));
     }

    }
}
