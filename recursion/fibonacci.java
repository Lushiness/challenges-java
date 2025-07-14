public class fibonacci {
    public static int fibonacci(int x){
        if (x<=1){
            return x;
        } else{
            return fibonacci(x-1) + fibonacci (x-2);
        }
    }
    public static void main(String[] args){
        int ans = fibonacci(5);
        System.out.println(ans);
    }
}
