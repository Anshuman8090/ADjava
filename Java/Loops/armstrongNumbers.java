package Java.Java.Loops;
import java.util.*;
public class armstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(IsArmstrong(n));
        
    }
    public static boolean IsArmstrong(int n){
        int d = CountOfDigit(n);
        int sum = 0;
        int p = n;
        while(n>0){
            int rem = n%10;
            sum = (int) (sum + Math.pow(rem, d));   //typecasted into int because power returns double
            n = n/10;
        }
        if(sum == p){
            return true;
        }
        else{
            return false;
        }
    }

    public static int CountOfDigit(int n){
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        return count;

    }
    
}
