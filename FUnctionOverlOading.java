public class FUnctionOverlOading {
    public static void main(String[] args) {
        fun("Hello");
        fun(7);
        fun(9,9);
       System.out.println("Vishal");
    }
    static void fun(int num){
        System.out.println(num);

    }
    static void fun(String f){
        System.out.println(f);

    }
    static void fun(int a,int b){
        System.out.println(a+b);
    }
    
}
