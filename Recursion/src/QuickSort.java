import java.util.Scanner;
import java.util.Arrays;
public class QuickSort {
    static void quicksort(int [] a , int s , int e){
        if(s<=e){
            int pi = helper(a, s, e);
             quicksort(a,s,pi-1);
             quicksort(a, pi+1,e);
        }
    }
    static int helper(int [] a ,int s , int e){
        int pi = a[e];
        int i = s-1;
        for(int j =s; j<e; j++) {
            if (a[j] < pi) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
            i++;
            int temp = a[e];
            a[e] = a[i];
            a[i] = temp;
            return i;



    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        quicksort(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }


}
