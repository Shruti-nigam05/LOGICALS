
class coustomclass {

    int id;      //{these are attributes like defining the template it contains these attribute }
    String name;
    int salary;

    public void print() { //{ and this is a method or function which are using attribute to perform a task }
        System.out.println("My id is : " + id);
        System.out.println("My last name is : " + name);

    }

    public int getSalary() {
        return salary;
    }
}

public class costmclass {

    public static void main(String[] args) {
        coustomclass shruti = new coustomclass();//instanting new object for coustom class
        coustomclass parul = new coustomclass(); //instanting new object for coustom class

        shruti.id = 14;
        shruti.name = "Nigam";
        shruti.salary = 99;

        parul.id = 18;
        parul.name = "Sharma";
        parul.salary = 51;

//int salary = parul.getSalary();
        //    System.out.println(obj.id);
        //     System.out.println(obj.name);
        shruti.print();
        parul.print(); // now i dont need to create multiple variables for different people i can just create obj and it will do the work
        //System.out.println(salary);
        System.out.println(parul.getSalary());
    }
}
