public class EvenNOofDigits {
    public static void main(String[] args) {
        int[] a={345,555,434,33,22223,33333};
        System.out.println(findNUmbers(a));
    }
    static int findNUmbers(int[] nums){
        int count=0;int n;int c=0;
        for (int i = 0; i < nums.length; i++) {
            n=nums[i];
            c=0;
            while(n>0){n=n/10;c++;}
            if(c%2==0){count++;}
        }
        return count;
    }
    
}
