import java.util.Scanner;
public class EvenANDOdd {
    static void even(int n) {
        if (n <= 0) {
            return;
        }
        even(n - 1);
        if (n % 2 != 0) { //n%=2!=0 for odd
            System.out.println(n);
        }
    }
    public static void main(String[] ages){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        even(5);
    }
}
