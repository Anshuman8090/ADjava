package Java.Java.Patterns;
import java.util.*;
public class Ipattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 1;
        int var = 1;
        int space = n-1;
        int val = 1;
        while(r<=n){
            int i = 1;
            while(i<=space){
                System.out.print("\t");
               i++;
            }
            int j = 1;                    // "\t" gives 4 spaces or tab space
            while(j<=var){
               System.out.print(val+"\t");
               val++;
               j++;
            }
            r++;
            var+=2;
            space--;
            System.out.println();
       }
    }  
}
