public class array_reverseOrder {
    public static void main(String[] args) {
        int[] arr = {2,4,8,5,9,6,4,7,9};
        for (int i = arr.length; i > 0; i--) {
            System.out.print(arr[i-1]);
        }
    }
}
