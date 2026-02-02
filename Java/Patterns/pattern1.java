package Java.Java.Patterns;

import java.util.*;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n; 
        while (row <= n) { 
            int i = 1; 
            while (i <= star) {      // n can be used at the place of star in the loop
                System.out.print("* ");
                i++;
            }
            row++;
            System.out.println();   

            
        }
    }
}