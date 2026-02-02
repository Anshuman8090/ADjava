package Java.Java.Patterns;
import java.util.*;
public class pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int r = 1;
       int star = 1;
       int space = n - 1;
       while(r<=n){
           int i = 1;
           while(i<=space){
               System.out.print("  ");                               
               i++;                                                  
           }                                                         
           int j = 1;
           while(j<=star){
               if(j%2 == 0) System.out.print("! ");
               else {System.out.print("* ");}
               j++;
           }
           space--;
           r++;
           star = star + 2;
           System.out.println();
       }
        
    }
    
}
