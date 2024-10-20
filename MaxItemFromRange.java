public class MaxItemFromRange {
    public static void main(String[] args) {
        int[] a={34,34,22,33,45,22};
        maxInRange(a,0,2);
    }
     static void maxInRange(int a[],int start,int end){
        int max=a[start];
        for (int i = start; i <=end; i++) {
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Max in Range "+start+"-"+end+" is "+max);
    }
    
}
