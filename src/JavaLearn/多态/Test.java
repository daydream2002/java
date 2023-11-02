package JavaLearn.多态;

public class Test {
    public static void main(String[] args) {
        Zi a= new Zi();
        a.print();
    }
}
class Fu{
    public final void print(){
        System.out.println("hello FU");
    }
}
class Zi extends Fu{

}
