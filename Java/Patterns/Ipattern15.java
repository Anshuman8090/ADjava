package Java.Java.Patterns;
import java.util.*;
public class Ipattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space2 = -1;
        int space1 = n/2;
        int r = 1;
        while(r<=n){
            int i = 1;
            while(i<=space1){
                System.out.print("  ");
                i++;
            }
            System.out.print("* ");

            int j = 1;
            while(j<=space2){
                System.out.print("  ");
                j++;
            }
            if(r > 1 && r < n){
                System.out.print("* ");
            }
            if(r<=n/2){
                space1--;
                space2+=2;
            }
            else{
                space1++;
                space2-=2;
            }
            r++;
            System.out.println();
       }
    }  
}
