package Java.Java.DataTypes;
import java.util.*;
public class binaryTOdecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a binary number : ");
        int n = sc.nextInt();
        int sum = 0;
        int mul = 1;
        while(n>0){
            int rem = n%10;
            sum = sum + rem * mul;
            mul = mul*2;
            n = n/10;
        } 
        System.out.print(sum);
    }
}
    

