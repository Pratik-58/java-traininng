interface A {
    static void sayHello(){
        System.out.println("HELLO");
    }
}
public class interstatic implements A{
    public static void main(String[] args) {
        A.sayHello();//in static interface face it always call by using interface name.
    }
}