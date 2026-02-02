package Java.Java.Patterns;
import java.util.*;
public class pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int space = n - 1;
        int r = 1;
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
                star = star + 2;
            }
            else{
                star = star - 2;
                space++;
            }
            r++;
            System.out.println();
       }
    }
}
