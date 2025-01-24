
import java.util.LinkedHashMap;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        
        // Create a LinkedHashMap of 
        // Strings (keys) and Integers (values)
        LinkedHashMap<String, Object> lhm = new LinkedHashMap<>();
        lhm.put("name" , "pratik");
        lhm.put("frnd" , "ajinkya");// key value doesnot be same 
        // Displaying the LinkedHashMap
        System.out.println(lhm);
    }
}

