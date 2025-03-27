
import java.util.*;

public class practice_set_methods {

    static void que1(Scanner sc) {
        System.out.println("enter n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }

    static void que2(Scanner sc) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x" + " ");
            }
            System.out.println("");
        }
    }

    static int que3(int n) {
        //int sum = 0;

        if (n == 0) {
            //System.out.println(0);
            return 0;
        } else if (n == 1) {
//System.out.println("1"); 
            return 1;
        } else {
            return n + que3(n - 1);
        }

        //   for(int i = 1; i<=n;i++){
        //    sum = sum + i;
        //   }
        //   return sum;
    }
static  void que4(){
    for (int i = 1; i <= 4; i++) {
        for(int j = 4; j >= i; j--){
            System.out.print("*"+" ");
        }
        System.out.println("");
    }

}

static int que5(Scanner sc){
System.out.println("enter the value you want to search number on: ");
int n = sc.nextInt();
System.out.println("enter lenth of series: ");
int a = sc.nextInt();
if(n > a){
    System.out.println("ERROR NUMBER IS OUT OF LENGTH ");
}
    int[] arr = new int[a];
    arr[0] = 0;
    arr[1] = 1;
    for (int i = 2; i < a; i++) {
        arr[i] = arr[i-1] + arr[i-2];
    }
    return arr[n];
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("enter n: ");
       // int n = sc.nextInt();
        // que1(sc);
        //que2(sc);
       // System.out.println(que3(n));
      // que4();
System.out.println(que5(sc));
    }
}
