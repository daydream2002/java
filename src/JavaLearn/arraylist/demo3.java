package JavaLearn.arraylist;

import java.util.ArrayList;

public class demo3 {
    public static void main(String[] args) {
        ArrayList<Student> list= new ArrayList<>();
        Student s1=new Student("张三",18);
        Student s2=new Student("李四",20);
        Student s3=new Student("王五",25);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+"  "+list.get(i).getAge());
        }

    }
}

