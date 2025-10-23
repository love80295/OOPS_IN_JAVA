package PROPERTIES;

public class POLYMORPHISM {
    public static void main(String[] args) {
        shapes shape = new shapes();
        triangle t = new triangle();
        square s = new square();
        circle c = new circle();
        s.area();
        over_loading obj = new over_loading();
        obj.sum(2,4);
        obj.sum(1,2,3);
    }
}
  class shapes{
    void area(){
        System.out.println("area of shapes");
    }
}
 class triangle extends shapes{
    void area(){
        System.out.println("area of triangle");
    }
}
class square extends shapes{
    void area(){
        System.out.println("area of square");
    }
}
class circle extends shapes{
    @Override // this is nothing but annotation
              // only use for checking.
    void area(){
        System.out.println("area of circle");
    }
}
class over_loading{
    int sum(int a , int b){
        return a+b;
    } // compile time / static polymorphism;
    int sum(int a , int b , int c){
        return a+b;
    }
}
class Static {
    static void a(){
        System.out.println("it is static");
    }
}
// Static methods cannot be overide
class B extends Static{
  //  @Override
    static void a(){
        System.out.println("hgiudfgh");
    }
}

