import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P13_SentenceExtractor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String keyWord = br.readLine();
        String text = br.readLine();
        
        String expression = String.format("(?<=^|[\\.,?!]\\s)[A-Z][^!?.]*? %s( [^!?.]*?)?[\\.?!](?=\\s|$)", keyWord);
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(text);
        
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
