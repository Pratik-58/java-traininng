

// for interface threading implements runnable-
class MyThread implements Runnable{
@Override
    public void run(){
        for(int i = 0 ; i<5 ; i++){
            System.out.println("pratik");
        }
        System.out.println("------------------");
        int c=10+5;
        System.out.println(c);
        System.out.println("------------------");
        int c1 = 10-5;
        System.out.println(c1);
        System.out.println("------------------");
        for(int i = 1 ; i<11 ; i++){
            System.out.println("5*"+i+"="+i*5);
        }

    }
}
public class InterfaceThread{
    public static void main(String[] args) {

        Thread t1 = new Thread();     
        t1.start();
        for (int i = 0 ; i<20 ; i++){
            System.out.println("main");
        }
    }
}