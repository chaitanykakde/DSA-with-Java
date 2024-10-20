
import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int arr[][]={
            {2,3,4},
            {56,78,66,66},
            {45,66,7},
            {5}
        };
        int a[]=searchInArray(arr, 7);
        System.out.println(Arrays.toString(a));
        System.out.println(maxin2D(arr));
        
    }

    private static int[] searchInArray(int[][] arr, int target) {
      for (int i = 0; i <arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if(target==arr[i][j]){return new int[] {i,j};}
        }
          
      }
      return new int[] {-1,-1};
    }

    private static int maxin2D(int[][] a){
        int max=Integer.MIN_VALUE;
        for(int[] ans:a){
            for(int value:ans){
                if(value>max){max=value;}
            }
        }
        return max;
    }
    
}
