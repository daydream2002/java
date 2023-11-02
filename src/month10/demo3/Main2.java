package month10.demo3;

public class Main2 {
    public static void main(String[] args) {
        new in(){

            @Override
            public void show() {
                System.out.println("shixian");
            }
        };
        new c(){

            @Override
            public void showc() {
                System.out.println("jicheng");
            }
        };
    }
}
interface in{
    public void show();
}
abstract class c{
    public abstract void showc();
}