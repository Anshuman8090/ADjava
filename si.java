import java.util.Scanner;
public class si {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter principal : ");
        int p = sc.nextInt();
        System.out.print("enter rate : ");
        int r = sc.nextInt();
        System.out.print("enter time : ");
        int t = sc.nextInt();
        double SI = (p*r*t)/100;
        System.out.println("si is : "+SI);
        
    }
    
}
