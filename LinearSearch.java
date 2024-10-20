public class LinearSearch {
    public static void main(String[] args) {
        int a[]={1,2,3,4,4,5,5,5,5,5,6,77};
        System.out.println(linearsearch1jj(a, 77));
    }
    //search in array
    static int linearsearch(int[] a,int target){
        for (int i = 0; i < a.length; i++) {
            if(target==a[i]){
                return i;
            }  
        }
        return -1;
    }
    //search target and return element if found
    static int linearsearch1(int[] a,int target){
        for (int n:a) {
            if(target==n){
                return n;
            }  
        }
        return -1;
    }
}
