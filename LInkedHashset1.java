import java.util.LinkedHashSet;

public class LinkedHashset1 {
    public static void main(String[] args) {
        LinkedHashSet h = new LinkedHashSet();
        h.add(89);
        h.add("pratik");
        h.add(null);
        h.add(26);
        h.add(26);// dont follow duplicate value
        System.out.println(h);
    }

    @Override
    public String toString() {
        return "LinkedHashset1 []";
    }
}
