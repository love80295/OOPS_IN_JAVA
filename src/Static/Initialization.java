package Static;

public class Initialization {
    static int a=1;
    static int b;
    static {
        b = a+5;

    }

    public static void main(String[] args) {
//        Initialization obj = new Initialization();
        System.out.println(Initialization.a +" " + Initialization.b);
    }
}
