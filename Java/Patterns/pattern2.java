package Java.Java.Patterns;

import java.util.*;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 1;
        int space = n - 1; 
        int star = 1;      
        while (r <= n) {   
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }
            r++;
            star++;
            space--;
            System.out.println();   
            
        }

    }
}
