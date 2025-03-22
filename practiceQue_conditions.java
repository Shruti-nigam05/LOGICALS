
import java.util.*;

public class practiceQue_conditions {

    public void checkIfPass(int m1, int m2, int m3) {

        int subtotal = m1 + m2 + m3;
        float total = (subtotal / 300f) * 100;
        if (m1 > 100 || m2 > 100 || m3 > 100) {
            System.out.println("invalid entry");
        } else if (m1 >= 33 && m2 >= 33 && m3 >= 33 && total >= 40) {
            System.out.println("student pass ");
        } else {
            System.out.println("student fail ");
        }
    }

    static double checkTax(float income) {
        double tax = 0;
        int income_num = (int) (income * 100000);

        if (income < 2.5) {
            // tax = 0;
            // System.out.println("No Tax (low income) ");
        } else if (income >= 2.5 && income < 5.0) {
            tax = income_num * (5 / 100d);
            // System.out.println(" Tax is 5% ie. " + tax);
        } else if (income >= 5.0 && income < 10.0) {
            tax = income_num * (20 / 100d);
            // System.out.println(" Tax is 20% ie. " + tax);
        } else if (income >= 10.0) {
            tax = income_num * (30 / 100d);
            // System.out.println(" Tax is 30% ie." + tax);
        }
        return tax;
    }

    public void dayOfWeek(int day) {
        switch (day) {
            case (1):
                System.out.println("ITS MONDAY");
                break;

            case (2):
                System.out.println("ITS TUESDAY");
                break;

            case (3):
                System.out.println("ITS WEDNESDAY");
                break;

            case (4):
                System.out.println("ITS THURSDAY");
                break;

            case (5):
                System.out.println("ITS FRIDAY");
                break;

            case (6):
                System.out.println("ITS SATURDAY");
                break;

            case (7):
                System.out.println("ITS SUNDAY");
                break;

            default:
                System.out.println("invalid number");

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        practiceQue_conditions obj = new practiceQue_conditions();

        /* FOR MARKS LOGIC
        
        System.out.println("enter marks of 3 subjects out of 100 : ");
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();

        int mark4 = sc.nextInt();
        int mark5 = sc.nextInt();
        int mark6 = sc.nextInt();

        obj.checkIfPass(mark4, mark5, mark6);
         */
        obj.checkIfPass(12, 55, 98); // float percent = total * 100;


        /*FOR TAX LOGIC 
        System.out.println("Enter your income (in lakh) : ");
        float income = sc.nextFloat();
         */
        double c1;
        c1 = checkTax(12f);
        System.out.println(c1);
        System.out.println(obj.checkTax(12.89f));

        /*FOR WEEK DAY LOGIC 
        System.out.println("enter week day number : ");
         */
        int day = sc.nextInt();
        obj.dayOfWeek(day);

    }
}
