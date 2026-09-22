import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class IntersectionOFTwoArray394 {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter nums1");
        int nums1 = sc.nextInt();
        int [] arr1 = new int[nums1];
        for(int i =0; i<nums1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter nums2");
        int nums2 = sc.nextInt();
        int [] arr2 = new int[nums2];

        for(int i =0; i<nums2; i++){
            arr2[i] = sc.nextInt();
        }

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int i: arr1){
            s1.add(i);
        }
        for(int i : arr2){
            if(s1.contains(i)){
                s2.add(i);
            }
        }
        int [] res = new int[s2.size()];
        int index =0;
        for(int i : s2){
            res[index] = i;
            index++;
        }
        System.out.println(Arrays.toString(res));
    }
}
