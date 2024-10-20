

public class MaxWealth {
    public static void main(String[] args) {
        int a[][]={
            {1,2,3},
            {6,7,8},
            {8,9,8,7}
        };
        System.out.println(maxwealth(a));
    }
    public static int maxwealth(int[][] a){
        int max=0;
        int sum=0;
        for (int person = 0; person < a.length; person++) {
            sum=0;
            for (int account = 0; account < a[person].length; account++) {
                sum+=a[person][account];
            }
            if(sum>max){max=sum;}
            
        }
        return max;
    }
    
}
