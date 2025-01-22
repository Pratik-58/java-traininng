
import java.io.PrintWriter;

public class Exception {
    public static void main(String[] args) {
        //PrintWriter nw = new PrintWriter("abc.txt");
        int a = 10 ;int b=0;
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            
            e.printStackTrace();
        }
        System.out.println("i am in main");
    }
}
