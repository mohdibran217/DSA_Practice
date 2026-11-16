import java.util.Scanner;
public class CheckPalindrome {
    static int reverse(int n, int rev){
        if(n==0){
            return rev;

        }

        return reverse(n/10 , rev*10+n%10);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=0 && n==reverse(n,0)){
            System.out.println("Palindrome Number");
        }else {
            System.out.println("Not  Palindrom Nubmer");
        }
    }
}

//public class checkpalindromString{
//    static boolean helper(String str , int s, int e){
//        if(s>=e){
//            return true;
//        }
//        if(str.charAt(s)!= str.charAt(e)){
//            return false;
//
//        }
//        return helper(str, s+1,e-1);
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        helper(str,0,str.length()-1);
//    }
//}
