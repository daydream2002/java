package month10.demo3;

public class Main {
    public static void main(String[] args) {
        Int ii=new Int();
        ii.show();
        ii.show2();
        InterB.show3();
    }
}
interface Inter{
    public default void show(){
        System.out.println("show方法");
    }
    public void show2();
}interface InterB{
    public default void show(){
        System.out.println("show方法");
    }
    public void show2();

    static void show3() {
        System.out.println("show3");
    }
}
class Int implements Inter,InterB{

    @Override
    public void show() {
        Inter.super.show();
    }

    @Override
    public void show2() {
        System.out.println("show2");
    }
}