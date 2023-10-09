package JavaLearn.arraylist;

import java.util.ArrayList;

public class demo4 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User u1= new User("u1","u1","123");
        User u2= new User("u2","u2","234");
        User u3= new User("u3","u3","345");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        boolean flag=equals(list,"u4");
        System.out.println(flag);


    }
    public static boolean equals(ArrayList<User> list,String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)){
                return true;
            }
        }
        return false;
    }
}
