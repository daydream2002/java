import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Frined a = new Frined("王",16);
        Frined b=a;
        a=null;
        System.out.println(a);
        System.out.println(b);
        System.out.println(b.getName());
    }
}