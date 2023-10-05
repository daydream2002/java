package JavaLearn.arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("dddd");
        System.out.println(list);
        list.remove("aaa");
        System.out.println(list.remove("aa"));
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.set(1,"eee");
        System.out.println(list);
        String sn = list.get(0);
        System.out.println(sn);
        System.out.println(list.size());
    }
}
