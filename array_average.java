import java.util.*;

public class array_average {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter numbers of students:- ");
    int n = sc.nextInt();
    int[] marks = new int[n];
   System.out.println("enter marks of each student");
for (int i = 0; i <n; i++) {
    marks[i]= sc.nextInt();

}
int sum = 0;
for (int i = 0; i < marks.length; i++) {
    sum = sum + marks[i];
}
System.out.println(sum/n);

    }
}
