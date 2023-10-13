import java.util.Arrays;

public class ReverseArray {
    static void swap(int[]arr, int i, int j){
       int tmp = arr[i];
       arr[i] = arr[j];
       arr[j] = tmp;
    }
    public static void reverseArray(int[] arr) {
        for(int i=0;i<arr.length/2;i++){
           swap(arr, i, arr.length-i-1);
        }
        
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 4, 7, 9, 10};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}