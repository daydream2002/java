package month12.day8;

/**
 * @author wjh
 * @date 2023/12/8 17:25
 */
public class Student implements StudentInterface{
    String name;
    int age;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }

    @Override
    public void sing(String name) {
        System.out.println(this.name+"sing"+name);
    }

    @Override
    public void dance() {
        System.out.println("dancing");
    }
}
