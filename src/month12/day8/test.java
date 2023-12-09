package month12.day8;

/**
 * @author wjh
 * @date 2023/12/8 17:38
 */
public class test {
    public static void main(String[] args) {
        Student student = new Student("wjh",99);
        StudentInterface proxy = ProxyUtil.proxy(student);
        proxy.dance();
    }
}
