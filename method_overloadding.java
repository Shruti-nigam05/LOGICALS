
public class method_overloadding {

    static void met() {
        System.out.println("Hellooo peopleee ");
    }

    static void met(int a) { //here int a is PARAMETER WHEREAS THE CALLING OF METHOD --> MET(2000); {2000 is an ARGUMENT }
        System.out.println("Hellooo peopleee " + a + " ");
    }

    static int met(int a, int b) {
        //System.out.println("Hellooo peopleee ");
        return a + b;
    }

    static void met(int a, String b) {
        System.out.println("Hellooo peopleee ");
    }

    static int sum(int... arr) { // 3 dots ( ... ) work as varargs that means it gives us an array with no size we can add as many arguments as we want
        int result = 0;
        for (int a : arr) {
            result += a;
        }
         System.out.println("hello ");
        return result;
    }

    public static void main(String[] args) {
        met();
        met(200);
        System.out.println(met(10, 20));
        System.out.println(met(22, 10));
        System.out.println(sum(3,4));
        System.out.println(sum());
    }
}
