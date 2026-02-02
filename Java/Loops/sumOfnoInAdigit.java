package Java.Java.Loops;
import java.util.*;
public class sumOfnoInAdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem = 0;
        int sum = 0;
        while(n>0){
            rem = n%10;                       // sum of digits of a number
            sum+= rem;
            n = n/10;
        }
        System.out.print("sum of the given no. is : "+sum);
    }
}
    

