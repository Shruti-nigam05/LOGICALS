
public class String_methods {

    public static void main(String[] args) {
        String name = "Shruurti";

        // System.out.println(name.length());
        // System.out.println(name.toLowerCase());
        // System.out.println(name.toUpperCase());
        // System.out.println(name);
        // String nonTrimmed = "       Shruti      nigam    ";
        // System.out.println(nonTrimmed);
        // System.out.println(nonTrimmed.trim());
        System.out.println(name.substring(4));
        System.out.println(name.substring(2, 5));
        System.out.println(name.replace("r", "ss"));
        System.out.println(name.startsWith("Sh"));

        //Index of search from start and lastindexOf search from last 

        // System.out.println(name.indexOf('r',4));
        // System.out.println(name.lastIndexOf("r"));
        // System.out.println(name.endsWith("shruti"));
        // System.out.println(name.equalsIgnoreCase("shrUUrti"));

        System.out.println("My nam\te \n is shruti \" nigam \t heyaa");
    }
}
