public class recursion {
    static int factorial(int n){
        if( n == 0|| n == 1){
            //System.out.println("1");
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    static int fabonacci(int n){
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        System.out.print(arr[0]+", "+ arr[1]+", ");

        for(int i = 2 ; i<arr.length; i++){
            arr[i] = arr[i-1]+arr[i-2];
            System.out.print(arr[i] + ", ");
        }
        return 1;

    }

 public static void main(String[] args) {
    //Function calling itself is called RECURSION
    int x = 10;
  // System.out.println(factorial(x)); 
fabonacci(x);
 }

}
