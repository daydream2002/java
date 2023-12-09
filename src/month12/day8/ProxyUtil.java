package month12.day8;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author wjh
 * @date 2023/12/8 17:30
 */
public class ProxyUtil {
    public static StudentInterface proxy(Student student){
        StudentInterface stundent = (StudentInterface) Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),
                new Class[]{
                        StudentInterface.class
                },
                (proxy, method, args) -> {
                    System.out.println(method.getName());
                    if (method.getName().equals("sing")) {
                        System.out.println("proxy sing");
                    } else if (method.getName().equals("dance"))
                        System.out.println("proxy dancing");
                    return method.invoke(student, args);
                }
        );
        return stundent;
    }
}
