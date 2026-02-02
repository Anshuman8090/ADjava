package Java.Java.Patterns;
import java.util.*;
public class Ipattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n/2 + 1;
        int space = -1;
        int r = 1;
        while(r<=n){
            int i = 1;
            while(i<=star){
                System.out.print("* ");
                i++;
            } 
            int j = 1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k = 1;
            if(r == 1 || r == n){
                k = 2;
            }
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            if(r<=(n/2)){
                star--;
                space+=2;
            }
            else{
                star++;
                space-=2;
            }
            r++;
            System.out.println();
       }
    }   
}
