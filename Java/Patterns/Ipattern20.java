package Java.Java.Patterns;
import java.util.*;
public class Ipattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 1;
        int one = 1;
        int space = n-1;
        while(r<=n){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            int val = 1;
            while(j<=one){
                System.out.print(val+" ");
                val++;
                j++;
            }
            r++;
            one = one + 2;
            space--;
            System.out.println();
       }
    }  
}
