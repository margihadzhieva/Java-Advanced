import java.util.Scanner;

public class P04_Greeting {
    
    private final static String ASTERISKS = "*****";
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String firstName = scan.nextLine();
        String lastName = scan.nextLine();
        
        if (firstName.isEmpty()){
            firstName = ASTERISKS;
        }
        
        if (lastName.isEmpty()){
            lastName = ASTERISKS;
        }
    
        System.out.printf("Hello, %s %s!%n", firstName, lastName);
    }
}
