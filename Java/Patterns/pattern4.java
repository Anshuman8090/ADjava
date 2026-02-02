package Java.Java.Patterns;
import java.util.*;
public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int r = 1;
       int space = 0;
       int star = n;
       while(r<=n){
           int j = 1;
           while(j<=space) {
               System.out.print("  ");
               j++;                                            
           }                                                   
           int i = 1;                                          
           while(i<=star){
               System.out.print("* ");
               i++;
           }

           r++;
           space++;
           star--;
           System.out.println();
       }
    }
}
