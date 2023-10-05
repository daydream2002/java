package JavaLearn.string;

public class demo8 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("adljsfaokljlkfasf");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
