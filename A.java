public class A {
    static public void m1(){
        System.out.println("parent");
    }
}

public class B extends A{
    static public void m1(){
        System.out.println("child");
    }
}

public class Overriding {
    public static void main(String[] args) {
        A.m1();
        B.m1();
    }
}