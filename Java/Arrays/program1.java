package Java.Java.Arrays;
import java.util.*;
public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();                   // elements of arrays are printed with the help of a function/methon
        }
        display(arr);
    }
    public static void display(int [] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
