package Java.Java.DataTypes;
import java.util.*;
public class inverseofNUMBER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int pos = 1;
        while(n>0){
            int rem = n % 10;
            sum = (int) (sum + pos*Math.pow(10, rem-1)); //power fn is used and data type is changed into int becoz power fn returns double datatype but sum is declared as int.
            pos++;
            n = n/10;
        }
        System.out.println(sum);
    }
}
