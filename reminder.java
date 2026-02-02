import java.util.Scanner;
public class reminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a no. : ");
        int a = sc.nextInt();
        System.out.print("enter a no. : ");
        int b = sc.nextInt();
        int remain = a%b;
        System.out.print("remainder is : "+remain);

        

    }
    
}
