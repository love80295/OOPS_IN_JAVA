package PROPERTIES;

public class INHERITENCE {
    public static void main(String[] args) {
        box box = new box(5,6,8);
        box box2 = new box(box);
        System.out.println(box2.l+" "+box2.b+" "+box2.h);
        boxweight box3 = new boxweight(1,2,3,4 );
        System.out.println(box3.l+" "+box3.w);
        boxPrice box5 = new boxPrice(1,2,3,4);
        System.out.println(box5.l+" "+box5.price);
    }
}
class box {
     double l;
    double b;
    double h;
    box(){
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }
    // cube
    box(double side){
        this.l = side;
        this.b = side;
        this.h = side;
    }
    // default
    box(double l  , double b , double h){
        this.l = l;
        this.b = b;
        this.h = h;
    }
    box(box old){
        this.h = old.h; // iska matlab jo purana object h uski properties naye
                        // object me bhi chali jaye;
        this.b = old.b;
        this.l = old.l;
    }

}
class boxweight extends  box{
    double w;



    boxweight(){
        this.w = -1;
    }
    boxweight(double w){
        this.w = w;
    }

    public boxweight(double l, double b, double h, double w) {
        super(l, b, h);
        // this means usko cunstructor ko call karo jisme l,b,h pass kargaye h
        // use to initilize the value in parent class
        this.w = w;
    }
}
class boxPrice extends box{
    int price;
    boxPrice(){
        this.price = 0;
    }

    public boxPrice(double l, double b, double h, int price) {
        super(l, b, h);
        this.price = price;
    }
}


