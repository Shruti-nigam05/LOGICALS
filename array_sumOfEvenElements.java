public class array_sumOfEvenElements {
    public static void main(String[] args) {
        int[] array = {1,2,4,8,6,5,7,9};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                sum = sum + array[i];
            }
        }
        System.out.println("sum of all even numbers in the array is: "+ sum);
    }
}
