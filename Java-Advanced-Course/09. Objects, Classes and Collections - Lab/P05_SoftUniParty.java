import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class P05_SoftUniParty {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        Set<String> guestList = new TreeSet<>();
        
        String guest = br.readLine();
        
        while (!guest.equals("PARTY")){
            guestList.add(guest);
    
            guest = br.readLine();
        }
        
        guest = br.readLine();
        
        while (!guest.equals("END")){
            guestList.remove(guest);
    
            guest = br.readLine();
        }
    
        System.out.println(guestList.size());
        guestList.forEach(System.out::println);
    }
}
