package Java.Java.Loops;
import java.util.*;
public class fibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 1; i<=n; i++){
            int c = a+b;                           // fibonacci number.
            a = b;
            b = c;
            if(i == n){
                System.out.println(c+ " : is the "+n +"th fibonacci number.");
            }
       }

    }
    
}
