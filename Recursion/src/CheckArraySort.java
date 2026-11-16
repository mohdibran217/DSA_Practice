import java.util.Scanner;
public class CheckArraySort {
    static boolean sorted(int []arr ,int index){
        if(index >= arr.length-1){
            return true;
        }
        if(arr[index]> arr[index+1]){
            return false;
        }
        return sorted(arr,index+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();

        }
        if(sorted(arr,0)){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
}
