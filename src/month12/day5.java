package month12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.*;

/**
 * @author wjh
 * @date 2023/12/5 9:47
 */
public class day5 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(verifyName("wangjiahao"));
        System.out.println(verifyPassword("W2002"));
    }
    private static boolean verifyName(String name) {
        //长度6-18
        if (name.length() < 6 || name.length() > 18)
            return false;
        //只能是字母
        for (int i = 0; i < name.length(); i++) {
            if (!(name.charAt(i) >= 'a' && name.charAt(i) <= 'z' || name.charAt(i) >= 'A' && name.charAt(i) <= 'Z'))
                return false;
        }
        return true;
    }

    private static boolean verifyPassword(String password) {
        if (password.length() < 3 || password.length() > 8)
            System.out.println("false1");
        //第一位为字母
        if (!(password.charAt(0) >= 'a' && password.charAt(0) <= 'z' || password.charAt(0) >= 'A' && password.charAt(0) <= 'Z'))
            System.out.println("false2");
        //后面几位是纯数字
        for (int i = 1; i < password.length(); i++) {
            if ((password.charAt(i) >= '0' && password.charAt(i) <= '9'))
                System.out.println("false3");
            if (password.charAt(0)>='0')
                System.out.println("a");
        }
        return true;
    }
}

