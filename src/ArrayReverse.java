import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        // Write a method that accepts one int array and reverse it
        // method is void method, so you need to reverse argument array in place

        int[] inputArray = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(inputArray));
        reverseArray(inputArray);
        System.out.println(Arrays.toString(inputArray));
    }
    public static void reverseArray(int[] arr){
        int end = arr.length -1;

        for(int start = 0; start < arr.length / 2; start++) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
        }
    }
}
