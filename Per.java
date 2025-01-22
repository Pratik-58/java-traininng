import java.util.Scanner;

public class Per{
    public static void main(String[] args) {
        System.out.println("Enter your marks of 5 subjects :");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of subject 1:");
        int sub1 = sc.nextInt();
        
        System.out.println("enter marks of subject 2:");
        int sub2 = sc.nextInt();
        
        System.out.println("enter marks of subject 3:");
        int sub3 = sc.nextInt();
        
        System.out.println("enter marks of subject 4:");
        int sub4 = sc.nextInt();
        
        System.out.println("enter marks of subject 5:");
        int sub5 = sc.nextInt();
    
        float percentage = (sub1+sub2+sub3+sub4+sub5)/5;
        System.out.println("percentage of student is : "+percentage);  
        sc.close();
    }    
}