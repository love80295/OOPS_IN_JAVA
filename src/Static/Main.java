package Static;

public class Main {
    ;

    public static void main(String[] args) {
//       Basic love = new Basic(false , 2143 , "love" , 19 );
//       Basic sudarshan = new Basic(false , 2143 , "sudarshan" , 19 );
//        System.out.println(Basic.population);
//        System.out.println(Basic.population);
//        greet(); // kyuki greet call static se hua h , aur greet a non static function .
                 // h , in java i cant call a non static function from a static one
        fun();
        Main obj = new Main();
        obj.fun2();


    }
    static void fun(){
        Main obj = new Main();
        obj.greet();

    }
    void fun2(){
        greet();
    }

    void greet(){
        System.out.println("hello");
    }
}
