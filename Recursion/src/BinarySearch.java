import java.util.Scanner;

public class BinarySearch {
    static int binary(int []arr, int s, int e , int target){
        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid]> target){
           return binary(arr , s,mid-1,target);
        }
        return binary(arr,mid+1, e, target);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int []arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ans = binary(arr, 0 ,n-1, target);
        if(ans == -1){
            System.out.println("Element is not found");
        }else{
            System.out.println("Element is found:" + ans);
        }
    }
}
