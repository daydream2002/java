package JavaLearn.mystatic;

public class Student {
    String name;
    int age;
    static String teacherName;
    public void show(Student this){
        System.out.println("this"+this);
        System.out.println(name+","+age+","+teacherName);
    }
}
