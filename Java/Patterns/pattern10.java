package Java.Java.Patterns;
import java.util.*;
public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 1;
        int star = 1;
        int space = n - 1;
        while(r<=2*n-1){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;                              
            }                                     
            int j = 1;                            
            while(j<=star){                       
                System.out.print("* ");            //mirroring
                j++;                              
            }                                     
            if(r<n){
                space--;                          
                star++;
            }
            else{
                star--;
                space++;
            }
            r++;
            System.out.println();
       }
    }
    
}
