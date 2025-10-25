package PROPERTIES;

public class Abstraction {
    public static void main(String[] args) {
        son son = new son(19);
        daughter daughter = new daughter(19);
//        parent mom = new parent(); object of abstract class cannot be made
        son.career();
        son.partner();
        daughter.partner();
        parent.hello();
// static methods can be created in abstract classes
        son.normal();
//        parent.normal(); // it is an instance method belongs to an object
        // but object of abstract class cannot be made . that is why it is giving
        // an error.
        // we also cannot make abstract classes final as well

    }
}
 abstract  class  parent{
    int age;
    static void hello(){
        System.out.println("hello");
    }
    void normal(){
        System.out.println("normal method");
    }

//     public parent(int age) {
//         this.age = age;
//     }

     abstract void career();
    abstract void partner();
}
class son extends parent{
    public son(int age) {
        this.age = age;
    }

    @Override
    void career(){
        System.out.println("i want to be a billionaire");
    }
    @Override
    void partner(){
        System.out.println("i like akshara");
    }
}
class daughter extends parent{
    public daughter(int age) {
        this.age = age;
    }

    @Override
    void partner() {
        System.out.println("i love love");
    }

    @Override
    void career() {
        System.out.println("i want to be a doctor");
    }
}
