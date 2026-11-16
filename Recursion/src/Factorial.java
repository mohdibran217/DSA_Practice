 import java.util.Scanner;
public class Factorial {
        static int fac(int n){
            if(n==1 || n==0){
                return 1;
            }
            return n*fac(n-1);
        }
    static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number");
            int n = sc.nextInt();
//            int result = n*fac(n-1);
        System.out.println( "factorial"+fac(5));
    }
}
