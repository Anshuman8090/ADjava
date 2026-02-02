package Java.Java.Patterns;
import java.util.*;
public class Ipattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 1;
        int space = n-2;
        while(r<=n){
            if(r == 1 || r == n){
                int i = 1;
                while(i<=n){
                    System.out.print("* ");
                    i++;
                }
            }
            else{
                System.out.print("* ");

                int j = 1;
                while(j<=space){
                    System.out.print("  ");
                    j++;
                }
                System.out.print("* ");
            }
            r++;
            System.out.println();
       }
    } 
}
