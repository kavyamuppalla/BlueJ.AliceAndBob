/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = sr.next();
        if ((name.equals("Bob")) || (name.equals("Alice"))) {
            System.out.println("Hello " +name);
        }
        
    }
            
        
}
