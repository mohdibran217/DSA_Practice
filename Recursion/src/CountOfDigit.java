import java.util.Scanner;
public class CountOfDigit {
    static  int Count(int n){
        if(n>=0 && n<=9){
            return n;
        }
        return 1+Count(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Count(12345));
    }

}
