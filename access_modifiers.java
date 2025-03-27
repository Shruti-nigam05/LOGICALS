
class Employee1 {

    private int id;
    private String name;

    public void setID(int a) {
        id = a;
    }

    public int getID() {
        return id;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

}

public class access_modifiers {

    public static void main(String[] args) {
        Employee1 obj = new Employee1();

        obj.setID(50);
        obj.setName("Shruti");

        System.out.println(obj.getID());
        System.out.println(obj.getName());
    }
}
