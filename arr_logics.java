
import java.util.*;

public class arr_logics {

    static void array_logic(int[] arr, int[][] numbers, Scanner sc) {
        //user input for 1d array
        System.out.println("print 1d array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //user input for 2d array
        System.out.println("print 2d array elements: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        //display 1d array
        for (int num : arr) {
            System.out.println(num);
        }

       //diaplay 2 d array
        for (int[] element : numbers) {
            for (int val : element) {
                System.out.print(val + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n];
        int[][] numbers = new int[2][3];
        array_logic(arr, numbers, sc);

        
    }
}
