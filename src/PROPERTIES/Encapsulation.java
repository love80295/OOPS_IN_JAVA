package PROPERTIES;

public class Encapsulation {
    public static void main(String[] args) {
        A obj = new A(10 , "love");
       obj.getNum(); // use to get the value of num
//        int a = obj.num;
      //  System.out.println(a);
        object obj1 = new object(34);
        System.out.println(obj1.hashCode()); // giving random values
        System.out.println(obj instanceof A);
        System.out.println(obj.getClass()); // gives more information and it is
        // stores in a heap

    }
}
class A{
   private int num;
    String name;
    int[]arr;

    public A(int num , String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
// object class methods
class object{
    int num;

    public object(int num) {
        this.num = num;
    }

    @Override
    // hashcode means the unique representayion of a number
    public int hashCode() { // will be covered in hashmap
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() { // gives the string representation
        return super.toString();
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize(); // gets call , garbage collection
    }

