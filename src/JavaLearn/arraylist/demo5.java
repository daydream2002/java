package JavaLearn.arraylist;

import java.util.ArrayList;

public class demo5 {
    public static void main(String[] args) {
        ArrayList<Phone> list=new ArrayList<>();
        Phone p1 = new Phone("小米",199);
        Phone p2 = new Phone("华为",299);
        Phone p3 = new Phone("苹果",399);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        ArrayList<Phone> ans = getPhone(list);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i).getPrice()+"  "+ans.get(i).getBrand());
        }
    }
    public static ArrayList<Phone> getPhone(ArrayList<Phone> list){
        ArrayList<Phone> result=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice()<200){
                result.add(list.get(i));
            }
        }
        return result;
    }
}
