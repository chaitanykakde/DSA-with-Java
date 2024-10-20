public class MinItemFromArray {
    public static void main(String[] args) {
        int[] arr={45,45,43,23,23};
        min(arr);
    }

    private static void min(int[] a) {
        int min=a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("min:"+min);
          }
    
}
