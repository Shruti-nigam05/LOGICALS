
import java.util.*;

public class practiceQue_conditions {

    public void checkIfPass(int mark1, int mark2, int mark3) {

        int subtotal = mark1 + mark2 + mark3;
        float total = (subtotal / 300f) * 100;

        if (mark1 >= 33 && mark2 >= 33 && mark3 >= 33 && total >= 40) {
            System.out.println("student pass ");
        } else {
            System.out.println("student fail ");
        }
    }

    public void checkTax(float income) {
        double tax;
        int income_num = (int)(income * 100000);

        if (income < 2.5) {
            // tax = 0;
            System.out.println("No Tax (low income) ");
        } else if (income >= 2.5 && income < 5.0) {
            tax = income_num  * (5 / 100d);
            System.out.println(" Tax is 5% ie. " + tax);
        } else if (income >= 5.0 && income < 10.0) {
            tax = income_num * (20 / 100d);
            System.out.println(" Tax is 20% ie. " + tax);
        } else if (income >= 10.0) {
            tax = income_num * (30 / 100d);
            System.out.println(" Tax is 30% ie." + tax);
        }

    }

    public void dayOfWeek(int day){
        switch (day) {
            case (1) :
                System.out.println("ITS MONDAY");
                break;

                case (2) :
                System.out.println("ITS TUESDAY");
                break;

                case ( 3) :
                System.out.println("ITS WEDNESDAY");
                break;

                case ( 4) :
                System.out.println("ITS THURSDAY");
                break;

                case ( 5) :
                System.out.println("ITS FRIDAY");
                break;

                case ( 6) :
                System.out.println("ITS SATURDAY");
                break;

                case ( 7) :
                System.out.println("ITS SUNDAY");
                break;

                default:
                System.out.println("invalid number");
 
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter marks of 3 subjects out of 100 : ");
        // int mark1 = sc.nextInt();
        // int mark2 = sc.nextInt();
        // int mark3 = sc.nextInt();

        // System.out.println("Enter your income (in lakh) : ");
        // float income = sc.nextFloat();

        System.out.println("enter week day number : ");
        int day = sc.nextInt();
        
        practiceQue_conditions obj = new practiceQue_conditions();
        //    obj.checkIfPass(mark1, mark2, mark3); // float percent = total * 100;
        // obj.checkTax(income);
        obj.dayOfWeek(day);
      
    }
}
