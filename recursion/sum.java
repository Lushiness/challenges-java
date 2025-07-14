public class sum{
    public static int sum(int n){
        //Base case
        if (n == 1){
            return 1;
        }
        else {
            //recursive case
            return n + sum(n-1);
        }

    }

public static void main(String[] args){
    int result = sum(5); //calculates sum
    System.out.println("Sum: " + result);
}

}