package Java.Java.Patterns;
import java.util.*;
public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 1;
        int star = n;
        int space = n - 1;
        while(r<=2*n-1){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            if(r<n){
                space--;
                star--;
            }
            else{
                star++;
                space++;
            }
            r++;
            System.out.println();
       }
    }
}
