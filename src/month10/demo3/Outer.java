package month10.demo3;

public class Outer {
    int a=10;
    static int b=20;
     static class Inner1 {
         public void show1(){
             System.out.println("非静态");
         }
         public static void show2(){
             Outer o=new Outer();
             System.out.println("静态");
             System.out.println(o.a);
         }
    }
    class Inner2{
        public void show1(){
            System.out.println("非静态");
        }
        public static void show2(){
            System.out.println("静态");
        }
    }


}
