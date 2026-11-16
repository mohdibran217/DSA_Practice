import java.util.Scanner;
public class SumOfDigit {
    static int sumOfdigit(int n){
        if(n==0){
            return 0;
        }
        int sum = n%10+sumOfdigit(n/10);
        return sum;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int ans = n%10+sumOfdigit(n/10);
        System.out.println(ans);
    }
}
