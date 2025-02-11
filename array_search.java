import java.util.*;
public class array_search {
    public static void main(String[] args) {
        int[] arr ={ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the number you wnat to search in array :- ");
        int a = sc.nextInt();
        boolean found = false;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == a){
                System.out.println("it contains "+ a);
                found = true;
            }
        }
        if(!found){
            System.out.println("it does not contain "+ a);
        }
    }
}
