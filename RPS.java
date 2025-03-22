import java.util.*;
public class RPS {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum1 = rand.nextInt(3);
        int randomNum2 = rand.nextInt(3);

        Character i = 'r';
        Character j = 'r';

        if(randomNum1 == 0){
          i = 'R';
        }
        else if(randomNum1 == 1){
            i = 'P';
        }
        else if(randomNum1 == 2){
             i = 'S';
        }
        
        if(randomNum2 == 0){
            j = 'R';
          }
          else if(randomNum2 == 1){
              j = 'P';
          }
          else if(randomNum2 == 2){
               j = 'S';
          }
        System.out.printf("person 1 = %c, person 2 = %c \n", i,j);
          if(i=='R' && j=='S' || i=='P' && j=='R' || i=='S' && j=='P'){
             System.out.println("person 1(i) won");
          }
          else if(i==j){
            System.out.println("DRAW ");
          }
else{
    System.out.println("person 2(j) won");

}
    }
}
