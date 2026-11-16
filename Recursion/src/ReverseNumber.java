import java.util.Scanner;
public class ReverseNumber {
    static int reverse(int n , int rev ){
        if(n==0){
            return rev;
        }
        return reverse(n/10,rev * 10 + n%10);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = reverse(n,0);
        System.out.println("result:"+ ans);
    }
}
