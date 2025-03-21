import java.util.*;
public class practice_queString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //user input 
        System.out.println("enter your string: ");
        String name = sc.nextLine();

        System.out.println("lower case - "+ name.toLowerCase());
        System.out.println("space with under score - "+ name.toLowerCase().replace(" ", "_"));

        String letter = "Dear <|name|>, talks a lot";

        System.out.println(letter.replace("<|name|>", "shruti"));

        String name2 = name.replace(" ","*");
        if(name2.contains("**")){
            System.out.println("string has double");
        }
        else if(name2.contains("***")){
            System.out.println("string has triple");
        }
        else{
            System.out.println("it does not contain any double or triple space");
        }
       
        System.out.println("\" Dear harry, This course is nice , thanks\"");
    }
}
