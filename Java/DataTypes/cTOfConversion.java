package Java.Java.DataTypes;
import java.util.*;
public class cTOfConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min_F = sc.nextInt();
        int max_F = sc.nextInt();
        int count = sc.nextInt();
        for(int i = min_F; i< max_F; i+=count){
            int c = (int) ((5.0/9) * (i - 32));
            System.out.println(i+"\t"+c);
        }
    }
    
}
