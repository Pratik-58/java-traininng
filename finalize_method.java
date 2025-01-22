public class finalize_method {
    public static void main(String[] args) {
        finalize_method fm = new finalize_method();
        fm = null;
        System.gc();
        System.out.println("main method ends");
    }
    @Deprecated
    public void finalize(){
        System.out.println("i am in finalize");
    }
}

