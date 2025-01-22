import java.util.Scanner;

public class Add{
    public static void main(String[] args) {
        System.out.println("taking input from user :");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int a = sc.nextInt() ;
        System.out.println("Enter number : ");
        int b= sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);

        sc.close();

    }
}