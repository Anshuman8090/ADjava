package Java.Java.Arrays;

public class swapping {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};
        System.out.println(arr[0] + " " + arr[1]);
        Swap(arr,0,1);                              // swapping of an array
        System.out.println(arr[0]+ " "+ arr[1]);
    }
    public static void Swap(int [] arr, int i, int j){
        int tem = arr[i];
        arr[i] = arr[j];
        arr[j] = tem;
    }
    
}
