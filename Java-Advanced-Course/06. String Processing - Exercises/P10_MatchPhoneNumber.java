import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P10_MatchPhoneNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
    
        String expression = "\\+359( |-)[2]\\1\\d{3}\\1\\d{4}\\b";
        Pattern pattern = Pattern.compile(expression);
    
        while (!input.equals("end")){
            Matcher matcher = pattern.matcher(input);
        
            if (matcher.find()){
                System.out.println(input);
            }
        
            input = br.readLine();
        }
    }
}
