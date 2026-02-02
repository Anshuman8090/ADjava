package Java.Java.Patterns;
import java.util.*;
public class pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int r = 1;
        int star = 1;
        while(r <= 2*n - 1){
            int i = 1;                          
            while(i<=star){                     
               System.out.print("* ");               //mirroring
               i++;                            
            }                                   
            if(r<n){
               star++;
            }
            else{
               star--;
            }
            r++;
            System.out.println();
       }
    }
    
}
