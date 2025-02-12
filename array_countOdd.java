public class array_countOdd {
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,8,8,0,6,4,2};
int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
               count = count + 1;
            }
        }
        System.out.println("total number of odd values are: "+count);
    }
}
