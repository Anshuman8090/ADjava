package Java.Java.Patterns;
import java.util.*;
public class pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 1;
        int star = n;
        int space = 0;
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
                space = space + 2;
                star--;
            }
            else{
                space = space - 2;
                star++;
            }

            r++;
            System.out.println();
       }
    } 
}
