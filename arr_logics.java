
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

    static void Que1(float[] array, Scanner sc) {
        System.out.println("enter float elements of array");
        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextFloat();
        }

        float sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + array[i];
        }
        System.out.println("sum of array elements are : " + sum);
    }

    static void Que2(float[] array, Scanner sc) {
        System.out.println("enter number you want to check");
        float num = sc.nextFloat();
        Boolean Present = false;
        // for (int i = 0; i < array.length; i++) {
        //     if (array[i] == num) {
        //         Present = true;
        //     }
        // }
        for (float element : array) {

            if (element == num) {
                Present = true;
            }
        }
        if (Present == true) {
            System.out.println("number present");
        } else {
            System.out.println("not found");
        }
    }

    static void que3( ) {
        Scanner obj = new Scanner(System.in);
        int size;
        System.out.println("enter total marks: ");
        size = obj.nextInt();
        int[] marks = new int[size];
        for (int i = 0; i < size; i++) {
            marks[i] = obj.nextInt();
        }
        int sum = 0;
        for (int element : marks) {
            sum = sum + element;
        }

        int avg = sum / size;

        System.out.print("average of marks = " + avg);

    }

    static void que4(Scanner sc){
       int[][] matrix = new int[2][3];
       for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++) {
           matrix[i][j] = sc.nextInt();
        }
    }

       for (int i = 0; i < 2; i++) {
           for (int j = 0; j < 3; j++) {
               System.out.print(matrix[i][j]+" ");
           }
           System.out.println("");
       }
    }

    static  void que5(Scanner sc){
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter values of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
               max = arr[i];
            }
        }
        System.out.println("maximun number = "+max);
    }

    static  void que6(Scanner sc){
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter values of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
               min = arr[i];
            }
        }
        System.out.println("minimum number = "+min);
    }

    static void que7(Scanner sc){
        System.out.println("Enter array size ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("enter value of array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        boolean sorted = false;

        for (int i = 0; i < array.length-1; i++) {
            if(array[i] <= array[i+1]){
             sorted = true;
            }
            else{
                sorted = false;
            }
        }
        System.out.println("array sorted  "+ (sorted ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n];
        int[][] numbers = new int[2][3];
        float[] A = new float[5];
        

        // array_logic(arr, numbers, sc);
        // Que1(A, sc); //(SUM OF 5 FLOATS )
        // Que2(A, sc); //(NUMBER PRESENT OR NOT)
        // que3(); //(AVERAGE)   //WE CAN ADD EVERYTHING IN METHOD INTIALIZING TO USER EVERYTHING WITHOUT TAKING PARAMETERS ALSO BUT CANNOT BE USED OUTSIDE METHOD
        //que4(sc); //(2D ARRAY)
       // que5(sc); // (MAX)
       // que6(sc);   // (MIN)
       que7(sc); // (sorted)


    }
}
