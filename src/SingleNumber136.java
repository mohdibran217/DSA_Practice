import java.util.Scanner;
public class SingleNumber136 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int count =0;
        for(int i =0; i<n; i++){
            count = count ^ arr[i];

        }
        System.out.print(count);
    }
}
