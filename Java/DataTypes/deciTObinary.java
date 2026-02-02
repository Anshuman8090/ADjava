package Java.Java.DataTypes;
import java.util.*;
public class deciTObinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a decimal no. : ");
        int n = sc.nextInt();
        int sum = 0;
        int mul = 1;
        while(n>0){
            int rem = n%2;               //base of the no. in which we to covert
            sum = sum + rem * mul;
            mul = mul*10;                // jis base me se jana hai!
            n = n/2;                     // jis base me jaana hai 
        }
        System.out.println(sum); 
    }
    
}
