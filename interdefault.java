interface ABC {
    default public void m1(){
        System.out.println("it is default interface of interface ABC");
    }
}
interface XYZ {
    public void m2();//we need to add body in other class
    default public void m1(){
        System.out.println("it is default interface of interface XYZ");
    }
    
}
//making multiple iheritance
public class interdefault implements ABC,XYZ {
    public void m1(){
        XYZ.super.m1();
        ABC.super.m1();
    }
    public void m2(){
        System.out.println("it is abstract method of interface XYZ");
    }
    public static void main(String[] args) {
        InnerABC i = new InnerABC();
        i.m1();
        i.m2();
    }

    
}