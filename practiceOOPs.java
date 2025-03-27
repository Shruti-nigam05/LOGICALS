
class Employee {

    int Salary;
    String name;

    public int getSalary() {
        System.out.print("my salary is: ");
        return Salary;
    }

    public String getName() {
        System.out.print("my name is: ");

        return name;
    }

    public String setName(String new_name) {
        String name = new_name;
        System.out.print("my new name is: ");

        return name;
    }
}

class Cellphone {

    public void ringing() {
        System.out.println("phone is ringing");
    }

    public void vibrating() {
        System.out.println("phone is vibrating");
    }

}

class Square {

    int a;

    public void setLength(int c) {
        a = c; // assigning the value 
    }

    public int area() {
        return a * a;
    }

    public int parimeter() {
        return 4 * a;
    }
}

public class practiceOOPs {

    public static void main(String[] args) {
        Employee first = new Employee();
        Employee second = new Employee();

        first.Salary = 5000;
        first.name = "Shruti";

        second.Salary = 10000;
        second.name = "Parul";

        System.out.println(first.getSalary());
        System.out.println(first.getName());
        System.out.println(first.setName("Priya"));

        System.out.println(second.getSalary());
        System.out.println(second.getName());
        System.out.println(second.setName("Vidhi"));

        Cellphone funct = new Cellphone();

        funct.ringing();
        funct.vibrating();

        //System.out.println(funct.ringing());
        // System.out.println(funct.vibrating());
        Square one = new Square();

        one.setLength(8);

        System.out.println(one.area());
        System.out.println(one.parimeter());

    }
}
