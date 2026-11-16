import java.util.Scanner;
public class aPowerb {
    static int power(int a, int b){
        if(b==0){
            return 1;
        }
        int power = a * power(a,b-1);
        return power;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();
        int ans = a*power(a,b-1);
        System.out.println(ans);
    }
}
