import java.util.*;
public class arr_2D_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
            
        }

        System.out.println("Enter number you what to search");
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(arr[i][j] == x){
                  System.out.println("number found at "+ i + ", "+ j);
                }
            }
            
        }
    }
}
