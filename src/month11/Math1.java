package month11;

import JavaLearn.studentSystem.User;

import java.io.IOException;
import java.util.Arrays;

public class Math1{
    public static void main(String[] args) throws IOException, CloneNotSupportedException {
        int[] data={1,2,3};
        Student s1 = new Student("wjh",18,data);
        Student s2 = (Student) s1.clone();
        System.out.println(s1.getData()[0]=10);
        System.out.println(s1);
        System.out.println(s2);
        }
    }
class Student implements Cloneable{
    String name;
    int age;
    int[] data;

    public Student(String name, int age, int[] data) {
        this.name = name;
        this.age = age;
        this.data = data;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        int[] data = this.data;
        int[] newData = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            newData[i]=data[i];
        }
        Student u = (Student) super.clone();
        u.data = newData;
        return u;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
