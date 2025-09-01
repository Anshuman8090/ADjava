import java.util.Scanner;
public class takingin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius : ");
        int r = sc.nextInt();
        double pi = 3.1415;
        double area = pi*r*r;
        System.out.println("area is : "+area);
        
    }
    
}
