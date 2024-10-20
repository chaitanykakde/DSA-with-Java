

public class MaxItemFromArray {
    public static void main(String[] args) {
        int ar[]={1,56,78,89,5};
        max(ar);
    
    }

    private static void max(int[] ar) {
      int max=0;
      for (int i = 0; i < ar.length; i++) {
        if(ar[i]>max){
            max=ar[i];
        } 
      }
      System.out.println("Max:"+max);
    }
    
}
 

