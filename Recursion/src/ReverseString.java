import java.util.Scanner;
public class ReverseString {
    static void rev(String s , int i){
        if(i<0){
            return;
        }
        System.out.print(s.charAt(i));
        rev(s,i-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        rev(s,s.length()-1);
    }
}
