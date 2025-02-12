


public class array_max_min {

    public static void main(String[] args) {
        int[] array = {1,2,5,8,7,6,9};
       int min = array[0];
       int max = array[0];

       for (int i = 0; i < array.length; i++) {
           if(min > i){
             min = array[i];
           }
           if(max < i){
            max = array[i];
           }
        }
        System.out.println("minimum number is : "+min);
        System.out.println("maximum number is : "+max);
    }
}