public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={4,5,5,6,677,76,5};
        System.out.println(search(arr,677,0,4));
    }

    private static boolean search(int[] arr, int target, int start, int end) {
        for (int i = start; i <= end; i++) {
            if(arr[i]==target){return true;}
        }
        return false;
    }
    
}
