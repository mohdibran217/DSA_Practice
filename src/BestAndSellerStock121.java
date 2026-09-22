import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;
public class BestAndSellerStock121 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int minprofit = arr[0];
        int maxprofit = 0;
        for (int i =0; i<n; i++){
            if (arr[i] < minprofit){
                minprofit = arr[i];
            }
            int  profit = arr[i] - minprofit;
        if(profit > maxprofit){
            maxprofit = profit;
        }
        }
        System.out.println(maxprofit);
    }
}
