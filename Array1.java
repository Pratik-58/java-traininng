import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("give the lenght of array :");
        char a[] = new char[s];
        s.close();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value :");
        for(int i = 0 ; i<=s ; i++){
            array[i]=sc.nextInt();
        }
        System.out.println(a);
    }
}
