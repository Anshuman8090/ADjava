import java.util.Scanner;

public class sq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        int sq = n * n;
        System.out.println("square of a given no is : " + sq);
    }
}
