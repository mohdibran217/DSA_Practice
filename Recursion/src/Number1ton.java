import java.util.Scanner;
  public class Number1ton {

    static void printIncrease(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        printIncrease(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      printIncrease(n);

    }
  }




