package Java.Java.DataTypes;
import java.util.*;
public class chardataTYPE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);    // syntax for taking input of a character!
        char chh = 'b';
        System.out.println((int)(ch));
        System.out.println((int) (chh));
        System.out.println(ch+chh);  
        ch++;         //characters get added on the basis of their ascii value
        System.out.println(ch);
    }
}
