package Java.Java.Loops;
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = n;
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev  = rev*10 + rem;
            n = n/10;
        }
        if(rev == p){
            System.out.println(p + " is a palindrome");
        }
        else{
            System.out.println(p + " is not a palindrome");
        }
        // System.out.println(rev);
    }
}
