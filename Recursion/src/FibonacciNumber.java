import java.util.Scanner;
public class FibonacciNumber {
    static  int   fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int previous = fib(n-1);
        int previous_previous = fib(n-2);
        return previous+previous_previous;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(fib(7));
    }
}
