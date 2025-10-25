package PROPERTIES;

public class Interfaces {
    public static void main(String[] args) {
        car car = new car();
        car.acc();
        car.brake();
        car.start();
        car.stop();
        nicecar mycar = new nicecar();
        mycar.startPlayer();
        mycar.start();
    }
}
interface engine{
    static final int PRICE = 78000;
    void start();
    void stop();
    void acc();
}
interface brake{
    void brake();
}
interface media{
    void start();
    void stop();
}
class car implements engine , brake{
    @Override
    public void brake() {
        System.out.println("i brake like normal");
    }

    @Override
    public void stop() {
        System.out.println("i stop like normal");
    }

    @Override
    public void acc() {
        System.out.println("i accelerate like normal");
    }

    @Override
    public void start() {
        System.out.println(" i start like normal");
    }
}
class cdplayer implements media{
    @Override
    public void stop() {
        System.out.println("music stop");
    }

    @Override
    public void start() {
        System.out.println("music start");
    }
}
class powerengine implements engine{

    @Override
    public void stop() {
        System.out.println("stop power engine");
    }

    @Override
    public void acc() {
        System.out.println("accelarate power engine");
    }

    @Override
    public void start() {
        System.out.println("start power engine");
    }
}
class nicecar{
    private engine engine;
    private media player;
    public nicecar(){
        engine = new powerengine();
        player = new cdplayer();
    }

    public nicecar(engine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startPlayer(){
        player.start();
    }
}
// extending interfaces
interface AA{
    void fun();
}
interface BB extends AA{
    void greet();
}
class CC implements BB{
    @Override
    public void greet() {

    }

    @Override
    public void fun() {

    }
} // we have to implement both the methods.
